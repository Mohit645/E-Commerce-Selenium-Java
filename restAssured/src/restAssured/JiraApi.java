package restAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.springframework.util.Assert;

import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class JiraApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // given when then
		RestAssured.baseURI = "http://localhost:8080";
		
		// To save login session details
		SessionFilter session=new SessionFilter();
		
		String response = given().relaxedHTTPSValidation().header("Content-Type","application/json")
		.body("{\r\n" +

"    \"username\": \"mohit.frank\",\r\n" +

"    \"password\": \"mohit\"\r\n" +

"}").log().all().filter(session).when().post("/rest/auth/1/session").then()
		.log().all().extract().response().asString();
		
		String givenComment = "Jira comment";
		
		//To create a bug
		
		String bugResponse = given().header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"fields\": {\r\n" + 
						"        \"project\": {\r\n" + 
						"            \"key\": \"RES\"\r\n" + 
						"        },\r\n" + 
						"        \"summary\": \"End to End Jira issue\",\r\n" + 
						"        \"description\": \"Description for REST API\",\r\n" + 
						"        \"issuetype\": {\r\n" + 
						"        	\"name\": \"Bug\"\r\n" + 
						"        }\r\n" + 
						"\r\n" + 
						"}\r\n" + 
						"}").filter(session).when().post("/rest/api/2/issue").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js = new JsonPath(bugResponse);
		String bugId = js.getString("id");
		
		// Add comment
		String addCommentResponse = given().pathParam("key", bugId).log().all().header("Content-Type","application/json")
		.body("{\r\n" +

"    \"body\": \""+givenComment+"\",\r\n" +

"    \"visibility\": {\r\n" +

"        \"type\": \"role\",\r\n" +

"        \"value\": \"Administrators\"\r\n" +

"    }\r\n" +

"}").filter(session).when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat()
		.statusCode(201).extract().response().asString();
		
		JsonPath js1 = new JsonPath(addCommentResponse);
		String commentId= js1.getString("id");
		
		//Get issue details
		
	String issueDetails = 	given().log().all().filter(session).pathParam("key", bugId).queryParam("fields", "comment")
		.log().all().when().get("/rest/api/2/issue/{key}").then().log().all().extract().response().asString();
	
	JsonPath js2 = new JsonPath(issueDetails);
	int numberOfComments = js2.getInt("fields.comment.comments.size()");
	for(int i=0;i<numberOfComments;i++)

	{

	String commentIdIssue =  js2.get("fields.comment.comments["+i+"].id").toString();
	if (commentIdIssue.equalsIgnoreCase(commentId))
	{
		String message= js2.get("fields.comment.comments["+i+"].body").toString();
		System.out.println(message);
		break;
	}
	}
	

}
}

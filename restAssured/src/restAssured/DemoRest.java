package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DemoRest {
	
	//validate add API
	// given when then
	public static void main(String[] args) {
		
	
	RestAssured.baseURI = "https://automationintesting.online";
	String response = given().log().all()
	.when().get("/room/")
	.then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	JsonPath js = new JsonPath(response);
	String roomType = js.get("rooms.type").toString();
//	System.out.println(roomType);
	
	if(roomType.contains("Single"))
	{
		
		String tokenResponse = given().log().all().header("Content-Type","application/json").body("{\r\n" + 
				"	\"username\": \"admin\",\r\n" + 
				"	\"password\": \"password\"\r\n" + 
				"}").when().post("/auth/login/")
				.then().log().all().extract().response().asString();
		
		JsonPath js1 = new JsonPath(tokenResponse);
		String token = js1.getString("token");
		System.out.println(token);
	}

}
}

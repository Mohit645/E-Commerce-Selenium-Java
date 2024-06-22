package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Locations;

//@RunWith(Cucumber.class)
public class StepDefinition {
	ResponseSpecification resSpec;
	RequestSpecification res;
	Response response;

	@Given("Add place payload")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions
		String uri = "https://rahulshettyacademy.com";
		RestAssured.baseURI = uri;
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("29, side layout, cohen 09");
		ap.setLangauge("French-IN");
		
		ap.setName("Frontline house");
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		
		List<String> tl = new ArrayList<String>();
		tl.add("shoe park");
		tl.add("shop");
		
		ap.setTypes(tl);
		
		Locations location = new Locations();
		location.setLat(-38.383494);
		location.setLng(33.427362);
		ap.setLocation(location);
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(uri).addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON).build();
		
		resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		res = given().spec(req).body(ap);
				
		
	 //   throw new io.cucumber.java.PendingException();
	}

	@When("User calls {string} with the Post request")
	public void user_calls_with_the_Post_request(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  response = res.when().post("/maps/api/place/add/json").then()
			  .spec(resSpec).extract().response();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("the API call gets success with status code {int}")
	public void the_API_call_gets_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(response.getStatusCode(), 200);
	//    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} in response code is {string}")
	public void in_response_code_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		String resp = response.asString();
		String[] json = resp.split("\\{");
			
		JsonPath jp = new JsonPath("{"+json[1]);
		
		System.out.println(jp.getString(string).toString());
		assertEquals(jp.getString(string).toString(), string2);
	   // throw new io.cucumber.java.PendingException();
	}

}

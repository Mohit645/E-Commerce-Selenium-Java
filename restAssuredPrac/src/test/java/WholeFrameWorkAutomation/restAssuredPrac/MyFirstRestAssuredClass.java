package WholeFrameWorkAutomation.restAssuredPrac;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MyFirstRestAssuredClass {
	static String baseUri = "https://bookstore.toolsqa.com";
	static Response req;
	static String userId;
	static String userName = "TOOLSQA-Test";
	static String bodyCredentials =  "{\"userName\": \"TOOLSQA-Test\",  \"password\": \"Test@@123\"}";
	
	

	public static void main(String[] args) {
		
		authorizeRequest();
	//	generateToken();
		//addUser();
	//	getBooks();
	//	getBook();
	}
	public static void authorizeRequest()
	{
		HashMap<String, String> head = new HashMap<String, String>();
		head.put("accept","*/*");
		head.put("Content-Type","application/json");
		req = given()
	//	.header("accept","application/json")
	//	.header("Content-Type","application/json")
		.headers(head)
		.body(bodyCredentials)
		.post(baseUri+"/Account/v1/Authorized");
		
		System.out.println(req.statusCode());
		System.out.println(req.asPrettyString());
		System.out.println(req.getHeaders());
	}
	
	public static void generateToken()
	{
		req= given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(bodyCredentials)
				.post(baseUri+"/Account/v1/GenerateToken");
		
		System.out.println(req.statusCode());
		System.out.println(req.asPrettyString());
		System.out.println(req.path("result"));
	}
	public static void addUser()
	{
		bodyCredentials =  "{\"userName\": \"TOOLSQA-Test-Mohit10\",  \"password\": \"Test@@12345\"}";
		req=given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(bodyCredentials)
				.post(baseUri+"/Account/v1/User");
		
		System.out.println(req.statusCode());
		System.out.println(req.asPrettyString());
		userId = req.path("userID");
	}
	public static void getBooks()
	{
		req = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.get(baseUri+"/BookStore/v1/Books");
		
		//System.out.println(req.asPrettyString());
		HashMap<String, String> isbnAuthor = new HashMap<String, String>();
		ArrayList<String> key = req.path("books.isbn");
		ArrayList<String> value = req.path("books.author");
		
		for(int i =0; i<key.size();i++)
		{
			isbnAuthor.put(key.get(i), value.get(i));
		}
		
	/*	for(Entry<String, String> entry : isbnAuthor.entrySet())
		{
			System.out.println("The isbn :"+entry.getKey()+" and the author is : "+entry.getValue());
		}*/
	}
	public static void getBook()
	{
		req = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.queryParam("ISBN", "9781491904244")
				.get(baseUri+"/BookStore/v1/Book");
		
		System.out.println(req.asPrettyString());
		System.out.println(req.headers());
	}

}

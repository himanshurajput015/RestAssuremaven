package basic;

import org.json.JSONException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jsonintegration.JsonObjectAndArray;

import static io.restassured.RestAssured.given;

import java.io.File;

public class PostRequestTest {

	@Test
	public void postrequest() throws JSONException
	{
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api/users";
		
		JsonObjectAndArray ab= new JsonObjectAndArray();
		System.out.println(ab.Jsob());
		//File f1= new File("C:\\Users\\himanshurajput\\Project_Learning\\RestAssuredMaven\\student.json");
		
		Response resp= given().contentType(ContentType.JSON).log().all().body(ab.Jsob().toString()).post();
		
		System.out.println(resp.getStatusCode());
		resp.prettyPrint();
		
		
	}
}

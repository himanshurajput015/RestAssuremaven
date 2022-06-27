package basic;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest {

	@Test
	public void updatestudent()
	{
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath= "/api/users";
		
File f1= new File("C:\\Users\\himanshurajput\\Project_Learning\\RestAssuredMaven\\student.json");
		
		Response resp= given().contentType(ContentType.JSON).log().all().body(f1).put("/2");
		
		System.out.println(resp.getStatusCode());
		resp.prettyPrint();
		
		
		
		
	}
}

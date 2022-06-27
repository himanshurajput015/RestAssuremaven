package basic;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetRequest {

	@Test
	 public void GetStudent()
	 {
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
		Response resp= given().contentType(ContentType.JSON).log().all().get("/users/2");
		
		System.out.println(resp.getStatusCode());
		if(resp.getStatusCode()== 404)
			
		System.out.println("TestCase failed");
		else
		resp.prettyPrint();
	 }
}

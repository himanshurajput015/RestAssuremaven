package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Logging {
	
	@Test
	public void logingevent()
	{
		
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
	 given().contentType(ContentType.JSON).log().ifValidationFails().get("/users/2").then().statusCode(201);
	 
	}

}

package hemcrestValidation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class HemcrestExample1 {


	@Test
	 public void GetStudent()
	 {
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
		
		//resp.prettyPrint();
		given().get("/users?page=2").then().body("per_page", equalTo(6));
    }

	@Test
	public void Test2()
	{

		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
		
		//resp.prettyPrint();
		given().get("/users?page=2").then().body("support", hasKey ("url"));	
		
	}
	
	@Test
	public void Test3()
	{

		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
		
		//resp.prettyPrint();
		given().get("/users?page=2").then().body("data[0]", hasEntry ("first_name", "Michael"));	
		
	}
	
	@Test
	public void Test4()
	{

		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
		
		//resp.prettyPrint();
		given().contentType(ContentType.JSON).log().all().get("/users?page=2").then().body("data[0].last_name", equalTo ("Lawson"));	
		
	}
	
	@Test
	public void Test5()
	{

		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		
		
		//resp.prettyPrint();
		given().get("/users?page=2").then().body("support", hasValue ( "https://reqres.in/#support-heading"));	
		
	}

	
}
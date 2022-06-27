package schemavalidation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import  static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class JSONSchemaValidation {

	@Test
	public void jsonschemavalidation()
	{
		
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api";
		File schema= new File(System.getProperty("user.dir")+ "/schema.json");
		given().contentType(ContentType.JSON).log().all().get("/users/2").then().body(matchesJsonSchema(schema));
	}
}

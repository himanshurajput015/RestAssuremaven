package basic;


	
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import static io.restassured.RestAssured.given;

		
	public class ResponseLogging {
		@Test
		public void logingevent()
		{
			
			RestAssured.baseURI= "https://reqres.in/";
			RestAssured.basePath= "/api";
			
		 given().contentType(ContentType.JSON).get("/users/23").then().log().ifError();
		}

}

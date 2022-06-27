package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

public class GetStudentDetailsBetter {


		@Test
		public void getAllStudents()
		{
		 RestAssured.baseURI = "https://reqres.in/";
		 //RestAssured.port= 8080;
		 RestAssured.basePath= "/api/users?page=2";
		 
		 @SuppressWarnings("unused")
		 
		 Response resp= given().contentType(ContentType.JSON).header("X", "Y").log().all().get();
		 
		 System.out.println(resp.getStatusCode());
		 System.out.println(resp.getContentType());
		 System.out.println(resp.getTimeIn(TimeUnit.SECONDS));
		 resp.prettyPrint();
		 
	}
}

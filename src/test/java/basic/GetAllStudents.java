package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class GetAllStudents {

	@Test
	public void getAllStudents()
	{
	 RestAssured.baseURI = "https://reqres.in/";
	 //RestAssured.port= 8080;
	 RestAssured.basePath= "/api/users?page=2";
	 
	 @SuppressWarnings("unused")
	RequestSpecification req= given();
	 
	 //Define the type of content of the request
	 req = req.contentType(ContentType.JSON);
	 
	 //Getting the response of the request
	 Response response= req.get();
	 
	 //response.print();
	 
	 req= req.header("X", "Y");
	 
	 //Logging the parameters of the request
	 
	 //System.out.println(req.log().all());
	 //System.out.println(req.log().headers());
	 
	 System.out.println(response.getContentType());
	 //System.out.println(response.getHeaders());
	 System.out.println(response.getStatusCode());
	 System.out.println();
	
	 //for Better representation of the response
	 
	 response.prettyPrint();
	}

	
}

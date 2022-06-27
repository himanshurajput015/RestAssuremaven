package oopsjsonintegration;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Studentjson {
	

	@Test
	public void Test1()
	{
		JsTestByOOPs ab= new JsTestByOOPs("Himanshu", "QA Analyst");
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api/users";
		
		
Response resp= given().contentType(ContentType.JSON).log().all().body(ab).post();
		
		System.out.println(resp.getStatusCode());
		resp.prettyPrint();
	}
	
	@Test
	public void test2()
	{
	  
		@SuppressWarnings("unused")
		Student stu= new Student();
		RestAssured.baseURI= "https://reqres.in/";
		RestAssured.basePath= "/api/users";
		stu.setFirstname("Nitish");
		stu.setLastname("Rajput");
		stu.setID("5");
		stu.setAddress("MOh. Maqbara");
		stu.setAddress("Chhatri Wala Kuwa");
		stu.setAddress("Najibabad");
		//System.out.println(stu.getAddress());
		
Response resp= given().contentType(ContentType.JSON).log().all().body(stu).post();
		
		System.out.println(resp.getStatusCode());
		resp.prettyPrint();
		
	}
}

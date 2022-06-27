package jsonintegration;


	
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import static io.restassured.RestAssured.given;

import java.io.File;

	public class JsonObjectAndArray {
	
		@Test
		public void JsonObj() throws JSONException
		{
		 JSONObject obj= new JSONObject();
		 obj.put("name", "Himanshu");
		 obj.put("job", "Tester");
		 System.out.println(obj);
		 
		 RestAssured.baseURI= "https://reqres.in/";
			RestAssured.basePath= "/api/users";
			
			//File f1= new File("C:\\Users\\himanshurajput\\Project_Learning\\RestAssuredMaven\\student.json");
			
			Response resp= given().contentType(ContentType.JSON).log().all().body(obj.toString()).post();
			
			System.out.println(resp.getStatusCode());
			resp.prettyPrint();
		}

			public JSONObject Jsob() throws JSONException
			{
				JSONObject obj= new JSONObject();
				 obj.put("name", "Himanshu");
				 obj.put("job", "Tester");
				 return obj;
			}
			
			@Test
			public void jsonobj() throws JSONException
			{
				
				JSONObject obj= new JSONObject();
				obj.put("Firstname","Himanshu");
				obj.put("Lastname","Rajput");
				obj.put("ID","2");
				
				JSONArray arr= new JSONArray();
				
				arr.put("Moh. Maqbara");
				arr.put("Chhatri wala kuwa");
				arr.put("Najibabad");
				
				obj.put("Address", arr);
				
				System.out.println(obj);
				
			}
		
	}

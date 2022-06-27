package extractingDatafromjson;




	import org.testng.annotations.Test;
    import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

	public class ExtractVaiRestAssured<data1> {

		@Test
		 public void GetStudent()
		 {
			RestAssured.baseURI= "https://reqres.in/";
			RestAssured.basePath= "/api/users";
			
			Response resp= given().contentType(ContentType.JSON).log().all().get("?page=2");
			resp.prettyPrint();
			
			// Extracting data from the response
			 @SuppressWarnings("unused")  
			 //HashMap<String, String> data1= new HashMap<String, String>();
		ArrayList<HashMap<String, Object>> data=given().contentType(ContentType.JSON).log().all().get("?page=2").then().extract().path("data");
			 
			 
			 System.out.println(data);
			 System.out.println(data.size());
			 for(int i=0; i<data.size(); i++ )
			 {
				 System.out.println("Hashmap value at "+i+"th positon\n" );
				 //System.out.println(data.get(i));
				 HashMap<String, Object> data2= data.get(i);
				 System.out.println(data2.get("first_name"));
				 System.out.println(data2.get("last_name"));
				 System.out.println(data2.get("id"));
				 System.out.println(data2.get("email"));
				 System.out.println(data2.get("avatar"));
				 System.out.println("--------------------------------------------- \n");
			 }
			 
			
			 
			
			 }
			 
			 
		 }



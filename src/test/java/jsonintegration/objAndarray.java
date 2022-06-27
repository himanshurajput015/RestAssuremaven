package jsonintegration;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class objAndarray {

	
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
package oopsjsonintegration;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	public String Firstname;
	public String Lastname;
	public String ID;
	public List<String> Address= new ArrayList<String>();
	
	/*
	Student()
	{
		Address= new ArrayList<String>();
					
	}
	*/

	public void setAddress(String address) {
		
		Address.add(address);
	}


	public List<String> getAddress() {
		return Address;
	}


	


	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	

	

}

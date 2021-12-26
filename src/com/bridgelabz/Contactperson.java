package com.bridgelabz;

public abstract class Contactperson {
	static String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip_code;
	long phone_number;
	String email;

	
	
	public Contactperson(String first_Name , String last_Name, String address, String city, String state, int zip_code, long phone_number, String email) { 

		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.phone_number = phone_number;
		this.email = email;
	}	
	@Override
	   
	public String toString() {
		
		
	return String.format(first_Name+ " " + last_Name + " " + address + " " + city + " "
			+ state + " " + zip_code + " " + phone_number + " " + email);
}
   
}

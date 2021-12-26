package com.bridgelabz;

import java.util.Scanner;

public class AddressBook extends Contactperson{
	static Scanner input = new Scanner(System.in);
	static AddressBook[] contacts; 
	public AddressBook(String first_Name, String last_Name, String address, String city, String state, int zip_code,
			long phone_number, String email) {
		super(first_Name, last_Name, address, city, state, zip_code, phone_number, email);
		// TODO Auto-generated constructor stub
	
	}
	static void  addContacts() {
		
		 
		AddressBook person1 = new AddressBook ("lucky ","patel","main square","nashik","mh",6776,5337722,"lucky@gmail.com");
		AddressBook person2 = new AddressBook ("gita ","shah","main square","mumbai","mh",6748,5328922,"gita@gmail.com");
	    contacts =  new AddressBook [5];
	   contacts[0]= person1;
	   contacts [1] = person2;
	    
	   
	   for(int i = 1; i < contacts.length; i++) {
		   System.out.println(i);
	   }
	   
	}
      
 static void displayContacts() {
	System.out.println("\n---------------Contacts in Address Book----------------");
	for(int i = 0; i < contacts.length; i++) {
		   System.out.println(contacts[i]);
		   
	   }
	   
	
	}
	
	
	

			
public static void main(String[] args) {
	System.out.println("Welcome To Address Book Program.");

	addContacts();
	displayContacts();
	
	

}









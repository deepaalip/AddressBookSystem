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
	
	
	
/*	
	
	public static void editContact() {
		System.out.println("\nEnter first name to edit :- ");
		String name = input.next();
		

		for(int i = 0; i < contacts.length; i++) {
			System.out.println("before update");
			   System.out.println(contacts[i]);
		      
			  if (contacts.length != 0) {
				
				System.out.print("\nSelect option to edit..." + " 1.First_name." + " 2.Last_name." + " 3.Address."
						+ " 4.City" + " 5.State" + " 6.Zip_code" + " 7.Phone_number" + " 8.Email :- ");
				int option = input.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter new first name :- ");
					String newFirstName = input.next();
					contacts[i].first_Name = newFirstName;
					
					System.out.println("First name is updated.");
					break;
					
				case 2:
					System.out.println("Enter new last name :- ");
					String newLastName = input.next();
				    contacts[i].last_Name = newLastName;
					System.out.println("Last name is updated.");
					break;

				case 3:
					System.out.println("Enter new Address :- ");
					String newAddress = input.next();
					contacts[i].address = newAddress;
					System.out.println("Address is updated.");
					break;

				case 4:
					System.out.println("Enter new city name :- ");
					String newCity = input.next();
					contacts[i].city = newCity;
					System.out.println("City is updated.");
					break;

				case 5:
					System.out.println("Enter new state name :- ");
					String newState = input.next();
					contacts[i].state = newState;
					System.out.println("State is updated.");
					break;

				case 6:
					System.out.println("Enter new Zip code :- ");
					int newZip = input.nextInt();
					contacts[i].zip_code = newZip;
					System.out.println("Zip code is updated.");
					break;

				case 7:
					System.out.println("Enter new phone number :- ");
					long newPhone = input.nextLong();
					contacts[i].phone_number = newPhone;
					System.out.println("Phone number is updated.");
					break;

				case 8:
					System.out.println("Enter new email :- ");
					String newEmail = input.next();
					contacts[i].email = newEmail;
					System.out.println("Email is updated.");
					break;

				default:
					System.out.println("Please enter a number between 1 to 8 only...");
				
				}
			  }
			  System.out.println("after update");
			   System.out.println(contacts[i]);
		      
			  }
		}
*/
			public static void deleteContact() {
				System.out.print("Enter first name to delete contact:- ");
				String deleteByName = input.next();
               for (int i = 0; i < contacts.length-1; i++) {
					contacts[i] = contacts[i+1];
						System.out.println("\nSelected contact deleted successfully.");
						break;
					} 
		}
	
			public static void addMultiplePersons() {
				System.out.println("Enter how many contacts you want to add :- ");
				int userWant = input.nextInt();
				for (int i = 1; i <= userWant; i++) {
					addContacts();
				}
			}
public static void main(String[] args) {
	System.out.println("Welcome To Address Book Program.");

	addContacts();
	displayContacts();
	/*editContact();*/
	deleteContact();
	addMultiplePersons();
	
	
	System.out.print("Enter valid option to perform Address Book Application[1.Enter (or) 2.Exit] :- ");
	int enterExit = input.nextInt();
	if (enterExit == 1) {

		while (enterExit != 2) {
			System.out.println("Choose which operation you want to perform from below list :- ");
			System.out.println("1.Add Contact.");
			System.out.println("2.Edit Contact");
			System.out.println("3.Delete Contact");
			System.out.println("4.Display Address Book.");
			System.out.println("5.Exit from the Application");

			System.out.println("\nEnter your choice :- ");
			int userChoice = input.nextInt();

			switch (userChoice) {
			case 1:
				addMultiplePersons();
				break;
			case 2:
				/*editContact();
				break;*/
			case 3:
				deleteContact();
				break;
			case 4:
				displayContacts();
				break;
			default:
				System.out.println("Enter valid choice from the list...");
			}
			if (userChoice == 5) {
				System.out.println("Successfully exited from the Address Book Application.");
				break;
			}
		}
	} else if (enterExit == 2) {
		System.out.println("Successfully exited from the Address Book Application.");
	} else {
		System.out.println("Choose Valid option [1.Enter (or) 2.Exit]...");
	}
	
	
}
	

}









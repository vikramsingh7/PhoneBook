package ContactList;
import java.util.*;
import java.util.ArrayList;
public class ContactList {

	Scanner input = new Scanner(System.in);
	
	private Contact head;
	private int size;
	
	
	

	public void add ()  {
		String name;
		String phoneNumber;
		String email;
		String address;
		Contact current;
		Contact backCurrent;
		Contact on;
	
	
		System.out.println("Enter Full Name: ");
		name = input.nextLine();
		
		System.out.println("Enter Phone Number: ");
		phoneNumber = input.nextLine();
		
		System.out.println("Enter Email-Id:");
		email = input.nextLine();
		
		System.out.println("Enter Address: ");
		address = input.nextLine();
		
		current = head;
		
		if(head == null) {
			head = new Contact(name,phoneNumber,email,address,head);
			size++;
		}
		
		else if((head.getNext() == null) && (head.getName().compareTo(name) < 0) ) {
			
			on = new Contact(name,phoneNumber,email,address,null);
			head.setNext(on);
			size++;
			
		}
		else if(head.getName().compareTo(name) > 0) {
			head = new Contact(name,phoneNumber,email,address,head);
			size++;
		}
		
		else {
		for(int i=0; i<size; i++) {
			backCurrent = current;
			current = current.getNext();
			String temp = current.getName();
			
			if(current.getNext() == null ) {
				on = new Contact(name,phoneNumber,email,address,null);
				current.setNext(on);
				size++;
			}
			else if(name.compareTo(temp) < 0) {
				on = new Contact(name,phoneNumber,email,address,current);
				backCurrent.setNext(on);
				size++;
			}
		}
		}
		
		
	}
	
	
	public void display() {
		Contact current = head;
		System.out.println("The Contacts are sorted by name in order of ( a-z):");
		head.getAll();
      for(int i=0; i<size; i++) {
    	  
    	  if(current.getNext() != null) {
    	  current = current.getNext();
    	  current.getAll();
    	  }
      }
		
		
	}
	
	

public void displayParticular() {
	
	
    char o;
    int counter = 0;
	String search;
	System.out.println("'a' Seacrh by Name:");
	System.out.println("'b' Seacrh by PhoneNumber:");

	o = input.nextLine().charAt(0);
	if(o=='a') {
	System.out.println("Enter Name: ");
	search = input.nextLine();
	Contact current = head;
	for(int i=0; i<size; i++) {
	if(search.equals(current.getName())) {
		current.getAll();
       counter = 1;
	}
	else {
	  counter = 0;
	}
	current = current.getNext();
	}
	if(counter == 0) {
	System.out.println("Error!!!   No contact of this Name exists:");
	System.out.println();
	}
	}
	else if(o=='b') {
		System.out.println("Enter Phonenumber: ");
		search = input.nextLine();
		Contact current = head;
		for(int i=0; i<size; i++) {
		if(search.equals(current.getPhoneNumber())) {
			current.getAll();
			counter = 1;
		}
		else {
			counter =0;
		}
		current = current.getNext();
		}
		
		if(counter == 0) {
			System.out.println("Error!!!!!  No contact of this Phonenumber exists:");
			System.out.println();
		}
	}
	
	
	
}


public void remove() {
	String search ;
	int counter =0;
	Contact backCurrent =null;
	Contact on;
	System.out.println("Enter name of the contact you want to delete");
	search = input.nextLine();
	Contact current = head;
	
	if( (head.getName().compareTo(search) == 0) && (head.getNext() == null)) {
		head = null;
		size--;
		counter = 1;
	}
	else if(head.getName().compareTo(search) == 0) {
		head = head.getNext();
		size--;
		counter = 1;
	}
	else {
	
	for(int i=0; i<size;i++) {
		
		if(current.getName().compareTo(search) != 0) {
		    counter = 0;
		}
		else {
			counter = 1;
			
			
			on = current.getNext();
			backCurrent.setNext(on);
			current.setNext(null);
		
			 
			size--;
		}
		backCurrent = current;
		current = current.getNext();
	}
	
}
	
	if(counter == 0) {
		System.out.println("Sorry No name exists");
	}
	else {
		System.out.println("Name Successfully removed");
	}
	
}






public void getSize(){
	System.out.println(this.size);
}
	
}

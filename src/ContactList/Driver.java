package ContactList;
import java.util.Scanner;
import java.util.LinkedList;

public class Driver {
	
	
	ContactList contact = new ContactList();
	Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		
		Driver object = new Driver();
		System.out.println("                                  Welcome!!!");
		
		System.out.println("Name: Vikramjit Singh");
		System.out.println("Student Id: ");
		
		

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("This ContactBook Application allowes you to add,remove and edit contacts!");
		System.out.println("There are five options as shown below that performs various operations");
		System.out.println();


		object.run();
	}
	
	
	public void run(){
		
		
		
		
		
		char x = 'a';
	    while(x != 'q'){	
		
		System.out.println("'a' Add Contacts");
		System.out.println("'b' Display All Contacts");
		System.out.println("'c' Search Contact ");
		System.out.println("'d' Delete Contact");
		System.out.println("'e' Edit Contact");
		System.out.println("'q' Exit");

		
		
		x = input.next().charAt(0);
		
		switch(x){
		
		case 'a':
			contact.add();
			break;
			
		case 'b':
			contact.display();
			break;
			
		case 'c':
		contact.displayParticular();
		break;
			
		case 'd':
			contact.remove();
			break;
			
	
			
		case 'q':
			System.out.println("Successfully Loged-out!");
			break;
			
		default:
			System.out.println("Enter a Valid Character option:");
		    break;
		}
	}
		
	}
	
}

package ContactList;

public class Contact {

	private String name ;
	private String phoneNumber;
	private String address;
	private String email;

	public Contact next;
	
	
	
	public Contact(String name, String phoneNumber, Contact node) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = null;
		this.email = null;
		this.next = node;
	}
	
	public Contact(String name, String phoneNumber , String address, String email, Contact node){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.next = node;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	
	public void setPhoneNumber(String name) {
		 this.phoneNumber = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public  Contact getNext(){
		return this.next;
	}
	
	public  void setNext(Contact node){
	    this.next = node;
	}
	
	public void getAll(){
		System.out.println("Name: " +  getName());
		System.out.println("Phone Number: " + getPhoneNumber());
		System.out.println("Address: " + getAddress());
		System.out.println("Email: " + getEmail());
		System.out.println();
		
	}
}

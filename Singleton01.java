package DesignPatterns;

public class MyMain {
	
	
	public static void main(String[] args) {
		// create an singleton  object
		Login l1 =  Login.createInstance();
		
		Login l2 =  Login.createInstance();
		
		System.out.println("memory address of l1 object"+l1);
		System.out.println("Memory address of l2 objects"+l2);
		
		// memory address will be same because they are pointed to same place
	}
		
}



class Login{
	// make private static instance of a class
	private static Login obj;
	
	// make constructor private the any one from the outside the class can not 
	//  access to the constructor and make instances
	private Login() {}
	
	// make a method that return the object to create only one instance
	public static Login createInstance() {
		if(obj == null) {
			obj=  new Login();
		}
		return obj;
	}
	
	
			
			
}

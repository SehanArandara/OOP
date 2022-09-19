package myfirst;


public class Main{
	void m1() {
		System.out.println("method with no parameters");
	}
	void m1(String n) {
		System.out.println("This is method 2 : "+ n);
	}
	void m1(int a) {
		System.out.println("This is method 3 :"+a);
	}
	void m1(String a,int b) {
		System.out.println("This is method 4");
	}
	/*String m1() {
		can not use 
	}*/
	public static void main(String[] args) {
		Main main = new Main();
		
		main.m1();
		main.m1("Sehan");
		main.m1(10);
		main.m1("Sehan",10);
		
		
			
	}
	
	
}

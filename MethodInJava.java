

public class Main{
	
	
	public static void main(String[] args) {
		Main m = new Main();
		
		StaticMethod();
		Main.StaticMethod();
		
		m.Method2();
		
			
	}
	
	void Method2() {
		System.out.println("This is called by using an object");
	}
	static void StaticMethod() {
		System.out.println("This is an static method");
	}
}

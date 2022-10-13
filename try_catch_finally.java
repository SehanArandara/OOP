import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		try {
			System.out.println("enter a whole number");
			int x = s1.nextInt();
			
			System.out.println("ente a whole number ");
			int y = s1.nextInt();
			
			int z =x/y;
			
			System.out.println("value of z :"+z);
		}catch(ArithmeticException e) {
			System.out.println("we can not divid whole number from zero");
		}catch(Exception e) {
			System.out.println("something is oing wrong");
		}finally {
			System.out.println("finally block execute always");
		}
		
	}
}


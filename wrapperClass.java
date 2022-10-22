package myfirst;


public class Main{
	
	public static void main(String[] args) {
		
		Integer x =  new Integer(150);
		
		System.out.println(x);
		
		int z = x;    // converting wrapper class to premitive - unboxing
		
		System.out.println(z);
		
		z = 140;
		
		x=z;   // auto-boxing
		
		System.out.println(x);
			
	}
	
	
}


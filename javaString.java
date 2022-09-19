package myfirst;


public class Main{
	
	public static void main(String[] args) {
		// i
		String name="sehan";
		String name2= "sehan";
		
		boolean b1=name==name2;
		
		System.out.println(b1);
		
		//ii
		String s1 = new String("Sohan");
		String s2 = new String("Sohan");
		
		b1 = (s1==s2);
		
		System.out.println(b1);
		
		// iii
		String s3 = new String("Sohan");
		String s4 = new String("Sohan");
		String s5 = s3;
		
		b1 = s3.equals(s4);
		
		System.out.println(b1);
		
		// iv 
		String n1="sehan";
		n1+="deemantha";
		String  n2= "Arandara";
		n2=n1+n2;
		
		System.out.println(n2);
		
		//v
		System.out.println(s3.equals("sohan"));
		System.out.println(s3=="Sohan");
		System.out.println(s3==s5);
		
		//vi
		System.out.println(n1.length());
		System.out.println(n1.toUpperCase());
		System.out.println(n1.toLowerCase());
		
		
	}
}

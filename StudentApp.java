package myfirst;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		// creating object array
		Student[] s= new Student[5];
		
		// variables
		String name,degree,mobile;
		
		// scanner
		Scanner s1= new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter your name :");
			name=s1.nextLine();
			System.out.println("enter your degree");
			degree=s1.nextLine();
			System.out.println("enter your mobile :");
			mobile=s1.nextLine();
			
			
			s[i] = new Student(name,degree,mobile);
			
		}
		for(int i=0;i<5;i++) {
			s[i].print();
		}
	}
}

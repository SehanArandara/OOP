package myfirst;

import java.util.ArrayList;

public class Main{
	// array lists are resizable arrays
	
	public static void main(String[] args) {
		// example 01
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(10);
		marks.add(15);
		marks.add(100);
		
		
		for(int i=0;i<3;i++) {
			System.out.println(marks.get(i));   // get the values from an arraylist
		}
		// example 02
		ArrayList<String> n = new ArrayList<String>();
		
		n.add("sehan");
		n.add("Saveendya");
		n.add("umesh");
		
		n.set(2,"Umesh changed");   // used to changed the value in certain index
		
		for(int i=0;i<n.size();i++) {
			System.out.println("name :"+ n.get(i));
		}
		
		
	}
}

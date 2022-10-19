

import java.util.HashSet;


public class Main{
	
	public static void main(String[] args) {
		// HashSet have no order but the duplicate values will remove
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("sehan");
		hs.add("Yasiru");
		hs.add("Sehan");
		hs.add("chamith");
		hs.add("chamith");
		
		for(String i : hs) {
			System.out.println("my name is"+ i);
		}
		
		
		
		
	}
}


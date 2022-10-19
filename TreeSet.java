import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(100);
		ts.add(250);
		ts.add(12);
		ts.add(12);
		
		System.out.println(ts);
		
		// output will be sorted as ascending and no duplicated values 
	}
}

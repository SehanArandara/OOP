
import java.util.Stack;

public class Main{
	
	public static void main(String[] args) {
		// stack also a collection like array List but we can only add and remove
		//elements to add the end of the stack
		
		Stack<String> myStack = new Stack<>();
		
		myStack.add("sehan");
		myStack.add("isuru");
		myStack.push("pahasra");
		
		System.out.println(myStack);
		
		myStack.pop();
		
		System.out.println(myStack);
		
		System.out.println(myStack.get(0));
	}
}



import java.util.PriorityQueue;
import java.util.Stack;

public class Main{
	
	public static void main(String[] args) {
		// priorityList is always give priority to first elemnt
		
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		
		PQ.add(100);
		PQ.add(200);
		PQ.add(300);
		PQ.add(400);
		
		System.out.println(PQ);
		//Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		System.out.println(PQ.peek());
		// remove the first element
		PQ.poll();
		System.out.println(PQ);
	}
}


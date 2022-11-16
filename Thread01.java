package thread;

//thread 01  class that extends inbuilt thread class

public class thread01 extends Thread{
	
	public static void main(String[] args) {
		//to start the child thread we have to create a thread object
		thread01 t01 = new thread01();
		// to execute the run() method we have to call the start method
		t01.start();
		
		// main thread
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread "+i);
		}
	}
	
	// we have to override this run() method
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread "+i);
		}
		
	}
	
}

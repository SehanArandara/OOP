package thread;

public class MyMain {

	public static void main(String[] args) {
		//to start the child thread we have to create a thread object
		thread01 t01 = new thread01();
		// to execute the run() method we have to call the start method
		t01.start();
		
		thread01 t2 = new thread01();
		t2.start();
		
		// main thread
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread "+i);
			try {   //thread.sleep create an unchecked exception so that we have to solve the problem to run the program
				Thread.sleep(100);    // do the first iteration and sleep for 100 miliseconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

// thread 01  class that extends inbuilt thread class

class thread01 extends Thread{
	
	// we have to override this run() method
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

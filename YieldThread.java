package thread;


public class MyMain extends Thread{
	
	// child thread
	public void run() {
		System.out.println("child thread");
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	// main thread
	public static void main(String[] args)  {
		MyMain m1 = new MyMain();
		m1.start();
		
		m1.yield();    /*
		
		*The yield() method of thread class causes the currently 
		*executing thread object to temporarily pause and allow 
		*other threads to execute.
		*/
		System.out.println("main thread");
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}

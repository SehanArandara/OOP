package thread;


public class MyMain extends Thread{
	
	// child thread
	public void run() {
		System.out.println("This is child thread"+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println("CHILD THREAD"+i);
		}
		System.out.println("End of the chld thread execution");
	}
	// main thread
	public static void main(String[] args) throws InterruptedException {
		MyMain m =  new MyMain();
		m.start();
		System.out.println("This is main thread");
		m.join();   // we have to handle the excepton
		/*try {
			m.join();         // method that give permission to execute child method and stop executing 
			//                   of main thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		System.out.println("Main thread started to execute");
		for(int i=0;i<5;i++) {
			System.out.println("Main thread"+i);
		}
		System.out.println("End of the main thread execution");
		
	}
	
}

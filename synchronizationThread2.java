package thread;


public class MyMain{
	
	// main thread
	public static void main(String[] args) {
		Document doc =  new Document();   // create object to lock the thread
		Thread10 t10 =  new Thread10(doc);   // create a thread objecta and pass the lock object
		Thread20 t20 = new Thread20(doc);
		t10.start();    // start the threads
		t20.start();	
	}
	
}

class Document{
	
	public  void update(Document obj) {  // add synchronied to a particular object
		//
		//
		//making some block code as synchronized
		synchronized(obj) {
			for(int i=1;i<=3;i++) {
				System.out.println(Thread.currentThread().getName()+"Thread is updated "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	// synchronized means lock a thread to complete the thread whole task and hold other threads
	
}

class Thread10 extends Thread{
	Document d;
	
	public Thread10(Document d) {
		super();
		this.d=d;
	}
	
	public void run() {
		d.update(d);
	}
	
	
}

class Thread20 extends Thread{
	Document d;
	
	public Thread20(Document d) {
		super();
		this.d=d;
	}
	
	public void run() {
		d.update(d);
		
	}
	
}



/*
 * output of without synchronization in update method
 * 
 * 
 * 
Thread-0Thread is updated 1
Thread-1Thread is updated 1
Thread-1Thread is updated 2
Thread-0Thread is updated 2
Thread-0Thread is updated 3
Thread-1Thread is updated 3
 * 
 * */


/*
 * output of with synchronization in update method
 * 
Thread-0Thread is updated 1
Thread-0Thread is updated 2
Thread-0Thread is updated 3
Thread-1Thread is updated 1
Thread-1Thread is updated 2
Thread-1Thread is updated 3

 * 

 * 
 * */
 

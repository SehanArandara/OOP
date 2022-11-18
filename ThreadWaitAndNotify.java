package thread;


public class MyMain extends Thread{
	
	public static void main(String[] args) {
		MyMain m1 = new MyMain();
		
		Thread t1 = new Thread01(m1,"new thread 01");
		Thread t2 = new Thread02(m1,"new thread 02");
		
		t1.start();
		t2.start();
	
	}
	
	
}

class Thread01 extends Thread{
	MyMain obj;
	
	public Thread01 (MyMain obj,String name) {
		super(obj,name);
		this.obj=obj;
		
	}
	
	public void run() {
		synchronized(obj) {
		
				System.out.println("started "+Thread.currentThread().getName()+" wait");
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			
		}
		
	}
}

class Thread02 extends Thread{
	MyMain obj;
	
	public Thread02 (MyMain obj,String name) {
		super(obj,name);
		this.obj=obj;
		
	}
	
	public void run() {
		
		synchronized(obj) {
		
				System.out.println(Thread.currentThread().getName()+" notify thread");
				obj.notify();
				
			
		}
		
	}
}


/*
 * started new thread 01 wait
new thread 02 notify thread
new thread 01 0
new thread 01 1
new thread 01 2
new thread 01 3
new thread 01 4
new thread 01 5
new thread 01 6
new thread 01 7
new thread 01 8
new thread 01 9*/



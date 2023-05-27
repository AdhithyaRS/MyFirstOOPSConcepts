package functionalInterface;



class X extends Thread{
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("Hello Thread");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
class Y extends Thread{
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("Hi Thread");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
	}
}
class Multi implements Runnable{
	
		public void run() {
			int i=0;
			while(i<5) {
				System.out.println("Hello Runnable");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
		}
	
}
class Multi1 implements Runnable{
	
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("Hi Runnable");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}
class ThreadSafe{
	int counter;
	public synchronized void counter() {
		counter++;
	}
}
public class LearnThreads {
	public static void main(String args[]) throws InterruptedException {
		X objA = new X();
		Y objB = new Y();
		System.out.println(objA.getPriority());
		System.out.println(objB.getPriority());
//		objA.setPriority(10);
//		System.out.println(objA.getPriority());
		
		objA.start();
		objB.start();
		System.out.println("Runnable Thread started");
		Runnable objRunnable = new Multi();
		Runnable obj1 = new Multi1();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(objRunnable);
		t1.run();
		t2.run();
		objA.join();
		objB.join();
		t1.join();
		t2.join();
		ThreadSafe objSafe = new ThreadSafe();
		Runnable objRunnable2 = () ->
		{
			for(int i=0; i<100000; i++) objSafe.counter();
		};
		Runnable objRunnable3 = () ->
		{
			for(int i=0; i<100000; i++) objSafe.counter();
		};
		objRunnable2.run();
		objRunnable3.run();
		System.out.println(objSafe.counter);
		

}
}
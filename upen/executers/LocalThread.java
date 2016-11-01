package executers;

public class LocalThread {
	
	//This used for thread confinement
	
	ThreadLocal threadLocal=new ThreadLocal();
	
	class Thread1 implements Runnable
	{

		@Override
		public void run() {
			
			for(int i=0;i<10;)
			{
				i=i+2;
				threadLocal.set(i);
				System.out.println("Thread 1 - "+threadLocal.get());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	class Thread2 implements Runnable
	{

		@Override
		public void run() {
			for(int i=1;i<10;)
			{
				i=i+2;
				threadLocal.set(i);
				System.out.println("Thread 2 - "+threadLocal.get());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public static void main(String [] args)
	{
		LocalThread loc=new LocalThread();
		loc.threadLocal.set(300);
		
		int i=(Integer)loc.threadLocal.get();
		System.out.println("Main thread " +i);
		
		Thread1 thread1=loc.new Thread1();
		Thread t1=new Thread(thread1);
		Thread2 thread2=loc.new Thread2();
		Thread t2=new Thread(thread2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

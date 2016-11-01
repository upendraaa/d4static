package executers;

import java.util.concurrent.TimeUnit;

public class ThreadDemo implements Runnable {
	
	public int number;
	
	public ThreadDemo(int number)
	{
		this.number=number;
	}
	@Override
	public synchronized void run() {
            
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number=number+1;
		System.out.println("Thread "+Thread.currentThread().getName()+" Number "+number);
						
	}

}

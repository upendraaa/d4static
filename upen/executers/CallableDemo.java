package executers;

import java.lang.annotation.Retention;
import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
	
	int number;
	
	Object obj=new Object();
	
	public CallableDemo(int num)
	{
		number=num;
	}

	@Override
	public synchronized Integer call() throws Exception {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			number=number+1;
		  
		System.out.println("Callable  "+number);
		return null;
	}

}

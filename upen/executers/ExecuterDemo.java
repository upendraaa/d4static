package executers;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterDemo {
	
	public static void main(String[] tmeps)
	{
		ThreadDemo thread=new ThreadDemo(1);
		ExecutorService eService=Executors.newFixedThreadPool(2);
		
		   for(int i=0;i<10;i++)
		   {
			   eService.execute(thread);
		   }

		    
		    CallableDemo calDemo=new CallableDemo(2);
		    ArrayList<Future<Integer>> alist=new ArrayList<Future<Integer>>();
		    for(int i=0;i<10;i++)
		    {
		    Future<Integer> future=eService.submit(calDemo);
		    alist.add(future);
		    System.out.println(future.isDone());
		    
		    }

		    eService.shutdown();
		
	}
}

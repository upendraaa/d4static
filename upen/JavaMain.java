import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class JavaMain extends ParentClass {
	
	public static void main(String args[])
	{
		System.out.println("Upendra");
		
		String[] arr={null,"u","P","null",null};
		JavaMain jm=new JavaMain();
		jm.cleanArray(arr);
	}
	
	public void method1()
	{
		
	}
	
	public void cleanArray(String[] arr)
	{
		ArrayList<String> arralist=new ArrayList(Arrays.asList(arr));
		arralist.removeAll(Collections.singleton(null));
		arr=arralist.toArray(new String[arralist.size()]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

package Interview;

import java.util.Arrays;
import java.util.List;

public class InsertArray 
{
	public static void main(String[] args)
	{
		Object[] a = {1,2,3,4,5};
		List<Object> list = Arrays.asList(a);
		
		list.set(2,5);
		
		Object[] arr = list.toArray();
		
		for(Object no : arr)
		{
			System.out.print(no+" ");
		}
		
	}

}

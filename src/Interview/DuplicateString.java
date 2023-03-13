package Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString 
{
	public static void main(String[] args)
	{
	int[] a= {3,5,4,3,2,2,1,1};
	Set<Integer> s = new HashSet<Integer>();
	for(int no :a)
	{
		if(s.add(no)==false)
		{
			System.out.print(no+" ");
		}
	}
	}

}

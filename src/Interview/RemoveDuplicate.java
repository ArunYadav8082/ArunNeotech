package Interview;

import java.util.TreeSet;

public class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		int[] a = {1,4,2,2,3,4,4,5,5,2};
	    
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int arr:a)
		{
			ts.add(arr);
		}
		for(int no : ts)
		{
			System.out.print(no+" ");
		}
	}

}

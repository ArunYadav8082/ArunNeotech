package Interview;

import java.util.TreeSet;

public class Treea 
{
	public static void main(String[] args) 
	{
		int[] a = {3,5,4,3,2,2,1,4};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int no : a)
		{
			if(ts.add(no)==false)
			{
				System.out.print(" "+no);
			}
		}
	
	}

}

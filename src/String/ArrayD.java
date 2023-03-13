package String;

import java.util.HashSet;
import java.util.Set;

public class ArrayD {
	
	public static void main(String[] args) {
		
		int[] a = {3,5,4,3,2,2,1,2};
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int no : a)
		{
		/*	if(s.add(no)==false)
			{
				System.out.print(" "+no);
			}*/
			s.add(no);
			
		}
		System.out.println(s);
	}

}

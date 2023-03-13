package Collection;

import java.util.Arrays;

public class Demo7
{
	public static void main(String[] args)
	{
		int[] x = {10,15,13,16,12,14};
		
		Arrays.sort(x);
		
		System.out.println(Arrays.binarySearch(x, 15));
		System.out.println(Arrays.binarySearch(x, 18));
		
	}

}

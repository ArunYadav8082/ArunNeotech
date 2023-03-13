package java8Interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArray {
	
	public static void main(String[] args) {
		
		Integer[] a = {1,2,4,3,5};
		Integer[] b = {10,9,7,8,6,2};
		 
		Stream<Integer> as = Arrays.stream(a);
		Stream<Integer> ab = Arrays.stream(b);
		
		Integer[] addArray = Stream.concat(as, ab).sorted().distinct()
				                        .toArray(size->new Integer[size]);
		
		for(int arr : addArray)
		{
			System.out.print(" "+arr);
		}
		
		
		
		
	}

}

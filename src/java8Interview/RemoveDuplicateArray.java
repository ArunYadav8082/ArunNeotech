package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) {
		
		Integer[] a = new Integer[]{2,1,4,5,2,3,1,6,2,7,1,8,10,9};
		
		List<Integer> list = Arrays.asList(a);
		
		
		
		/*List<Integer> list2 = list.stream().distinct().sorted()
		                                      .collect(Collectors.toList());*/
		
		Integer[] arr = list.stream().sorted().distinct().toArray(size-> new Integer[size]);
		
		System.out.println(arr);
		
		for(Integer aa:arr)
		{
			System.out.println(aa);
		}
		 
		// System.out.println(list2);
		
		
	}

}

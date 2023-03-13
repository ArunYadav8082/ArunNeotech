 package java8Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateArray {
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {2,1,3,1,2,4,1,2,6,5,8,9,7,10};
		
		List<Integer> list = Arrays.asList(arr);
		
	 Set<Integer> set = list.stream().filter(e->Collections.frequency(list, e)>1)
				                                .collect(Collectors.toSet());
		System.out.println(set);
	}

}

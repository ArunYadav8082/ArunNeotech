package java8Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,1,3,2,4,5,7,8,5,3,1,9,4,1);
		
		Set<Integer> set = list.stream()
				          .filter(e->Collections.frequency(list, e)>1)
				          .collect(Collectors.toSet());
		
		System.out.println(set);
		
		List<Integer> list2 = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list2);
	}
	

}

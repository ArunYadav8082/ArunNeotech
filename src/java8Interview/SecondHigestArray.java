package java8Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigestArray {
	
	public static void main(String[] args) {
		
		Integer[] a = new Integer[] {1,4,3,6,8,9,5,2,7,10};
		
		List<Integer> list = Arrays.asList(a);
		
		Integer seh = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(seh );
	}

}

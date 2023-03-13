package java8Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNum {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0,2,4,6,1,7,5,9,10,8);
		// find second highest Numbers
		
		Integer seh = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(seh);
		
		// find second lowest Numbers
		
		Integer secl = list.stream().sorted().skip(1).findFirst().get();
		System.out.println(secl);
	}

}

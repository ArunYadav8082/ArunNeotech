package java8Interview;

import java.util.Arrays;
import java.util.List;

public class FindMinValueAnArray {
	
	public static void main(String[] args) {
		
		Integer[] a = new Integer[] {2,4,5,3,0,8,7,6,9};
		List<Integer> list = Arrays.asList(a);
		Integer integer = list.stream().sorted().findFirst().get();
		/*Integer integer = list.stream().sorted().skip(2).findFirst().get();*/
		System.out.println(integer);
	}

}

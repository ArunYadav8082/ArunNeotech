package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,10,3,9,5,6,7,8,4,2);
		
		List<Integer> limt = list.stream().sorted().limit(5).collect(Collectors.toList());
		System.out.println(limt);
		
		System.out.println("-------------------------------------");
		
		Integer sum = list.stream().sorted().limit(5).reduce((a,b)->a+b).get();
		
		System.out.println(sum);
		
		System.out.println("---------------------------");
		List<Integer> sk = list.stream().sorted().skip(5).collect(Collectors.toList());
		System.out.println(sk);
	}

}

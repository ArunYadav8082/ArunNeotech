package java8Interview;

import java.util.Arrays;
import java.util.List;

public class NumberSqureAvg {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,10,20,30,15);
		
		// first squre and than avrage 
		
		double avg = list.stream()
				         .map(e->e*e)
				              .filter(e->e>0)
				              .filter(e->e>=900)
			                    	.mapToInt(e->e)
				                         .average()
				                              .getAsDouble();
		
		System.out.println("avg is :"+avg);
	}

}
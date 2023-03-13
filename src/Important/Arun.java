package Important;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Arun {
	

	
	
	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			
			String otp = "";
			
			for(int i=1; i<7;i++)
			{
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
			
		};
		
		System.out.println(s.get());
		
		System.out.println("****************************");
		
	//	<---------------------------------------------------->
		
		int[] a = {1,2,4,5,6,7,8,9};
		
		int sum1 = 0;
		
		
		for(int i=0; i<a.length; i++)
		{
			sum1 = sum1+a[i];
		}
		
		int sum2 = 0;
		
		for(int i=1; i<=9; i++)
		{
			sum2 = sum2+i;
	    }
		
		System.out.println("missing number!!"+(sum2-sum1));
		
		System.out.println("*******************************");
	
//<----------------------------------------------->
		
		// Sequential stream() or normal Stream() 
		
		List<String> list = Arrays.asList("G","E","E","K","S");
		
		list.stream().forEach(System.out::println);
		System.out.println("*******************************");
		// Parallel Stream()
        
		list.parallelStream().forEach(System.out::println);
		
		// If we are using parallel stream() and ordered also maintained
		
		list.parallelStream().forEachOrdered(e->System.out.println(e));

	}
}

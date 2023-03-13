package Java8;
import java.util.function.*;

public class Test4 {

	public static void main(String[] args)
	{
		int[] x = {0,5,10,15,20,25,30,35,63,57,40};
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>25;
		
		// and() or() $ negate()
		
		for(int x1:x)
		{
			/*if(p1.and(p2).test(x1))
			{
				System.out.println(x1);
			
			}*/
			
			/*if(p1.or(p2).test(x1))
			{
				System.out.println(x1);
			}*/
			if(p1.negate().test(x1))
			{
				System.out.println(x1);
			}
		}
 		
	
	}

}

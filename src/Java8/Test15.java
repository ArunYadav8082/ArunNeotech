package Java8;
import java.util.function.*;
// using primitive version of Function

public class Test15
 {

	public static void main(String[] args)
	{
		IntFunction<Integer> f = i->i*i;
		System.out.println(f.apply(4));
	
	}

}

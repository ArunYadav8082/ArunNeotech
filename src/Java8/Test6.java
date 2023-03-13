package Java8;

import java.util.function.*;

public class Test6 {

	public static void main(String[] args)
	{
		Function<Integer, Integer> f = i->i*i;
		System.out.println(f.apply(4));
		

	}

}

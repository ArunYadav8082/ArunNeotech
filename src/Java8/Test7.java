package Java8;

import java.util.function.Function;

public class Test7 {

	public static void main(String[] args) 
	{
		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("Aditya"));
	

	}

}

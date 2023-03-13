package Java8;

import java.util.function.*;

public class Test8 {

	public static void main(String[] args)
    {
		Function<String, String> f = s->s.toUpperCase();
		System.out.println(f.apply("arun"));
	

	}

}

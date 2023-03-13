package Java8;
import java.util.Date;
import java.util.function.*;


public class Test11 {

	public static void main(String[] args)
	{
		Supplier<Date> s = ()->new Date();
		System.out.println(s.get());
		



	}

}

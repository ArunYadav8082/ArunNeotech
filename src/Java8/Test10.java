package Java8;
import java.util.function.*;

public class Test10 {

	public static void main(String[] args)
	{
		Consumer<String> c = s->System.out.println(s);
		c.accept("Arun");
		
	
	}

}

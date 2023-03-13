package Java8;
import java.util.function.*;

public class Test17 
 {

	public static void main(String[] args) 
	{
		IntToDoubleFunction f = i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(225));
		
	}

}

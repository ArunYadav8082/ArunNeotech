package Java8;
import java.util.function.*;

public class Test16 {

	public static void main(String[] args)
	{
		ToIntFunction<String> f = s->s.length();
		System.out.println(f.applyAsInt("Bhupesh"));
		System.out.println("<------------------------->");
		System.out.println(f.applyAsInt("Abhay"));
		
	}

}

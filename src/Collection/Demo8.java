package Collection;

import java.util.Arrays;
import java.util.List;

public class Demo8
{
	public static void main(String[] args)
	{
		String[] s = {"A","B","C","D","E"};
		
		List<String> list = Arrays.asList(s);
		System.out.println(list);
		
		list.set(4, "Arun");
		
		System.out.println(list);
		
		list.remove(2);
		
	}

}

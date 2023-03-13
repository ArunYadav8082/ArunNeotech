package Java8;

import java.util.function.*;

public class Test2 {

	public static void main(String[] args)
	{
		String[] s = {"Arun","Bhupesh","Vipin","Abhay"};
		
	//	Predicate<String> p = s1->s1.length()>4;
	//	Predicate<String> p = s1->s1.length()%2==0;
		Predicate<String> p = s1->s1.length()%2!=0;
		
		for(String s1:s)
		{
			if(p.test(s1))
			{
				System.out.println(s1);
			}
		}
		

	}

}

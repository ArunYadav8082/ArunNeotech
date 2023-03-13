package Interview;

import java.lang.reflect.Method;

public class Test 
{
	public static void main(String[] args) 
	{
		int count =0;
		Object o = new String("Arun");
		Class c = o.getClass();
		System.out.println("Fully Quqlified Class Name :"+c.getName());
		
		Method[] m = c.getDeclaredMethods();
		System.out.println("Method Information");
		
		for(Method m1 :m)
		{
			count++;
			System.out.println(m1.getName());
			
		}
		System.out.println("Total Numbers of methods :"+count);
		
	}

}

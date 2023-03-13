package Java8;

import java.util.function.*;

public interface Inerface1
{
	public void add(int a,int b);
}
	 class Test0 
{
	public static void main(String[]args)
	{
		Inerface1 l = (a,b)->System.out.println((a+b));
		l.add(10,20);
	}
}

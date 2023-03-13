package practice;

import java.util.*;

public class Example3
{
	public static void main(String[]args)
	{
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Aditya");
		l.add("Arun");
		l.add("Abhay");
		l.add("Lalu");
		l.add("Mohit");
		System.out.println(l);
		
		ListIterator itr = l.listIterator();
		while (itr.hasNext())
       {
		String s = (String) itr.next();
		if(s.equals("Arun"))
		{
			itr.remove();
		}
		else if(s.equals("Abhay"))
		{
			itr.add("Bhupesh");
			
		}
		else if(s.equals("Mohit"))
		{
			itr.set("Yadav");
			
		}
		
		System.out.println(l);
		
		
			
		}
	}

}

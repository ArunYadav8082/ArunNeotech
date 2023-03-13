  package Interview;

import java.util.ArrayList;
import java.util.Iterator;

public class ModificationException 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext())
		{
			Integer integer = itr.next();
			al.add(50);
			System.out.println(integer);
		}
		System.out.println(al);
	}

}

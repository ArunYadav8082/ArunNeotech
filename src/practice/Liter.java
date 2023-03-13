package practice;
import java.util.*;

public class Liter {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =1; i<=10; i++)
		{
			al.add(i);
		}
		ListIterator<Integer> itr = al.listIterator();
		System.out.println(itr);
		while(itr.hasPrevious())
		{
			Integer n = (Integer) itr.previous();
			System.out.println(n);
		}
	//	System.out.println(n);
		
	}

}

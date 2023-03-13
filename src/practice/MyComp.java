package practice;
import java.util.*;

class Comparat implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer n1 = (Integer) o1;
		Integer n2 = (Integer) o2;
		
		//return -n2.compareTo(n1);
		return n2.compareTo(n1);
		
	}
	   
}

public class MyComp {

	public static void main(String[] args)
	{
		Comparat c = new Comparat();
		TreeSet al = new TreeSet(c);
		
		for(int i =2; i<=10; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
	}

}
  

package practice;
import java.util.*;
public class Sublist1 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		System.out.println("Before sublist"+ " "+ al);
		
	    List list =    al.subList(2, 7);
	
	    System.out.println("After sublist"+ " "+ list);
	}

}

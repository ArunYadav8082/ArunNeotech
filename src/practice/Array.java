package practice;
import java.util.*;
public class Array 
{
	public static void main(String[]args)
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("Abhay");
		list.add("Arun");
		list.add("Abhay");
		
		System.out.println(list);
		
		//Adding element second position
		
		list.add(2, "Lalu");
		System.out.println(list);
		//Removing element
		list.remove(4);
		System.out.println(list);
		list.contains("Lalu");
		System.out.println(list);
		
	}
	

}


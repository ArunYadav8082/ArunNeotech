package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Example6 {

	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Abhay");
		list1.add("Arun");
		list1.add("Aditya");
		
		for(String elememt:list1)
		{
			System.out.println(elememt);
			
		}
		Collections.swap(list1, 0, 2);
		System.out.println("After swapping");
		
		
		for(String element2:list1)
		{
			System.out.println(element2);
		}
		
	}
	
	

}

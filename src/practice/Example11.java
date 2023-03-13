package practice;

import java.util.*;

public class Example11 {

	public static void main(String[] args)
	{
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Aditya");
		list1.add("Abhay");
		list1.add("Arun");
		list1.add("Sonu");
		System.out.println(list1);
		System.out.println("<---------------------->");
		System.out.println(list1.contains("Sonu"));
		System.out.println("<---------------------------->");
		list1.remove(0);
		System.out.println(list1);
		list1.addFirst("Bhupesh");
		list1.set(1, "Lalu");
		System.out.println("<-------------------------->");
		System.out.println(list1);
		list1.add(0, "Vipin");
		System.out.println("<------------------------------>");
		list1.forEach(e->System.out.println(e));
		System.out.println("<------------------------>");
		// convert LinkedList into ArrayList
		List<String> list = new ArrayList<String>(list1);
		list.forEach(e->System.out.println(e));
		
		
	}

}

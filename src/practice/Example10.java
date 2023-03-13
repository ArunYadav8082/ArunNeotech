package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Example10 {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Arun");
		list1.add("Aditya");
		list1.add(0, "Abhay");
		list1.addLast("Bhupesh");
		
		System.out.println(list1);  
		
		System.out.println("--------------------------");
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Vipin");
		list2.add("Vivek");
		list2.add("Vinay");
		list2.add("Sonu");
		
		System.out.println(list2);
		System.out.println("----------------------------");
		list2.addAll(0, list1);
		System.out.println(list2);
		System.out.println("<--------------------------->");
		
	//	Iterator itr = list2.listIterator(1);
		// Decreasing order 
		Iterator itr = list2.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("<-------------------------------->");
		
		list2.forEach(e->System.out.println(e));
	}

}

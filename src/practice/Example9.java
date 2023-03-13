package practice;

import java.util.LinkedList;

public class Example9 {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Abhay");
		list1.add("Arun");
		list1.add("Aditya");
		
		System.out.println(list1);
		
		System.out.println("----------------------------");
		
		for(String element :list1)
		{
			System.out.println(element);
		}
         
		list1.addFirst("Bhupesh");
		list1.addLast("Omkar Yadav");
		
		System.out.println(list1);
		System.out.println("---------------------------------------");
		
		/*list1.getFirst();
		list1.getLast();
		list1.get(2);*/
		System.out.println(list1);

	}

}

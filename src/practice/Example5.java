package practice;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Abhay");
		list1.add("Arun");
		list1.add("Aditya");
		list1.add("Lalu");
		
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Vipin");
		list2.add("Vivek");
		list2.add("Vinay");
		list2.add("Bhupesh");
		
		System.out.println(list2);
		
		// join arrayList
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(list1);
		al.addAll(list2);
		System.out.println(al);
	}
	

}

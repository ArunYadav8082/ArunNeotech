package practice;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Abhay");
		list1.add("Lalu");
		list1.add("Mohit");
		list1.add("Bhupesh");
		System.out.println(list1);
		System.out.println("Checking the above list is empty or not"+" "+list1.isEmpty());
		// remove the all element in the list
		list1.removeAll(list1);
		System.out.println("After removing the elememet"+" "+ list1.isEmpty());
	}

}

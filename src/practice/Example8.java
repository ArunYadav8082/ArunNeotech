package practice;

import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sitapur");
		al.add("Lucknow");
		al.add("Sultanpur");
		al.add("Hardoi");
		
		System.out.println(al);
		
		// increase the capacity
		al.ensureCapacity(8);
		al.add("Kanpur");
		al.add("Bhopal");
		al.add("Noida");
		al.add("3542");
		System.out.println("After increasing the capacity"+"  "+al);
		
		
	
	}

}

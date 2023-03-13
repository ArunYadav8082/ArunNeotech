package practice;
import java.util.*;

public class Example1 
{
	public static void main (String[]args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhay Yadav");
		al.add("Arun Yadav");
		al.add("Aditya Yadav");
		al.add("Vivek Yadav");
	    al.add("Vinay Yadav");
	    al.add("Vipin Yadav");
	    al.add("Lalu Yadav");
	    System.out.println(al);
	    
	    String element1 = al.get(3);
	    System.out.println(element1);
	    element1 = al.get(0);
	    System.out.println(element1);
	    
	    for(String element:al)
	    {
	    	System.out.println(element);
	    	
	    }
}
}

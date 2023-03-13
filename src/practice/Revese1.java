package practice;
import java.util.*;
public class Revese1 {

	public static void main(String[] args)
	{
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");	
		al.add("8");
		al.add("9");
		
		System.out.println("Before reversing"+" "+ al);
		
		Collections.reverse(al);
		
		System.out.println("After reversing"+" "+ al);
		
		
	}

}

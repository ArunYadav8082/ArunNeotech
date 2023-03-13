package practice;
import java.util.*;
public class Suffle
{
	public static void main(String[]args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhay");
		al.add("Vivek");
		al.add("Aditya");
		al.add("Vinay");
		al.add("Bhupesh");
		al.add("Arun");
		al.add("Ayush");
		al.add("Vipin");
      
		System.out.println("Before Suffling list"+ al);
		
		Collections.shuffle(al);
		
		System.out.println("After Suffling list"+ al);

}
}

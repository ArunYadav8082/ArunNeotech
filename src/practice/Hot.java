package practice;
import java.util.*;

public class Hot {

	public static void main(String[] args) 
	
	{
		Stack s = new Stack();
		
		s.add("Arun");
		s.add("Abhay");
		s.add("Aditya");
		s.add("Vipin");
		s.add("Bhupesh");
		
		
		//System.out.println(s.push("Abhay"));
		//System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.search("Saini"));
		System.out.println(s);
	}

}

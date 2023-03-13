package Collection;
import java.util.*;

public class Sta 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		System.out.println(s);
		System.out.println("________________________");
		s.push(70);
		System.out.println(s);
		System.out.println("___________________________");
		System.out.println(s.peek());
		System.out.println("__________________________");
		System.out.println(s.pop());
		System.out.println("___________________________");
		System.out.println(s.search(80));
		
		
	}

}

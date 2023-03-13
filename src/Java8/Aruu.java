package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class Aruu {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sandeep");
		al.add("Arun");
		al.add("Abhay");
		al.add("Aditya");
		al.add("Bhupesh");
		al.add("Sanjeev");
		al.add("Vipin");
		
		List<String> list = al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		
		list.forEach(e->System.out.println(e));

		
		
		

	}

}

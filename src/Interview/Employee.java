package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10000);
		al.add(30000);
		al.add(40000);
		al.add(50000);
		al.add(60000);
		al.add(70000);
		
		 al.stream().filter(i->i>=30000).map(i->i+i/10).collect(Collectors.toList()).forEach
		 (e->System.out.println(e));
	
	}

}

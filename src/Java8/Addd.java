package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class Addd {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =1;i<=20;i++)
		{
			al.add(i);
		}
		List<Integer> list = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
	//	System.out.println(list);
		
		list.forEach(e->System.out.println(e));
		
		System.out.println("************************************");
		long numbers = al.stream().filter(i->i%2==0).count();
		
		System.out.println(numbers);
	

	}

}

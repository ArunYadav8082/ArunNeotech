package Collection;
import java.util.*;
import java.util.stream.Collectors;

public class Demo1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(50);
		System.out.println(al);
		
     List<Integer> list
     = al.stream().map(i->i+5).sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	
     System.out.println("______________________________________________");
     list.forEach(e->System.out.println(e));
	}
	

}

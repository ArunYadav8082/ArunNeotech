package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class Acc {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		List<Integer> list = al.stream().map(i->i+10).collect(Collectors.toList());
		list.forEach(e->System.out.println(e));
	}

}

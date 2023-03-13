package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class AAa {

	public static void main(String[] args)
	{
	 ArrayList<Integer> al  = new ArrayList<Integer>();
	 for(int i = 1;i<=10;i++)
	 {
		 al.add(i);
	 }
	// al.forEach(e->System.out.println(e));
	 
	 List<Integer> list = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	 
	// System.out.println(list);
	 list.forEach(e->System.out.println(e));
	}

}

package Java8;
import java.util.*;

public class BB {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(18);
		al.add(25);
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(22);
		// find mini
		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		System.out.println("*********************************");
		
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
	}

}

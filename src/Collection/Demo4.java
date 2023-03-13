package Collection;
import java.util.*;

public class Demo4 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		al.stream().forEach(i->System.out.println("The Squre of :"+i+"-> "+i*i));
	}

}

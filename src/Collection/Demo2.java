package Collection;
import java.util.*;

public class Demo2
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al  = new ArrayList<Integer>();
		
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(30);
		al.add(80);
		al.add(34);
		al.add(20);
		al.add(29);
		
		long failsstudent = al.stream().filter(m->m<35).count();
		
		System.out.println(failsstudent);
	}

}

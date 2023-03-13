package Collection;
import java.util.*;

public class TeeSat {

	public static void main(String[] args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(30);
		t.add(40);		
		t.add(20);
		t.add(50);
		t.add(70);
		t.add(60);
		System.out.println(t);
		System.out.println(t.comparator());
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println("_______________________");
		System.out.println(t.headSet(40));
		System.out.println("_______________________");
		System.out.println(t.tailSet(40));
		System.out.println("_______________________");
		System.out.println(t.subSet(20, 60));
	}

}

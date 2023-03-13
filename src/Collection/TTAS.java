package Collection;

import java.util.*;
public class TTAS {

	public static void main(String[] args) 
	{
		MyComparator mc = new MyComparator();
		TreeSet<Integer> t = new TreeSet<Integer>(mc);
		t.add(10);
		t.add(40);
		t.add(30);
		t.add(20);
		t.add(50);
		System.out.println(t);
	}

}
class MyComparator implements Comparator
{

	
	public int compare(Object o1, Object o2) 
	{
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	
}

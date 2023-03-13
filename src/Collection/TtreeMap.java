package Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TtreeMap 
{
	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap(new Sap());
		tm.put(10, "Abhay");
		tm.put(50, "Aditya");
		tm.put(40, "Arun");
		tm.put(20, "Vipin");
		tm.put(60, "Lalu");
		tm.put(30, "Bhupesh");
		
		System.out.println(tm);
		
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.lastEntry());
		
		System.out.println(tm.headMap(40));
		System.out.println(tm.tailMap(40));
		//System.out.println(tm.subMap(20, 60));
		
		
		
		
	}

}
  class Sap implements Comparator
  {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	  
  }

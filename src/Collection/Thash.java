package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Thash 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> m = new HashMap<Integer,String>();
		
		m.put(100, "Abhay");
		m.put(200, "Aditya");
		m.put(300, "Arun");
		
        System.out.println(m);
        
		System.out.println(m.put(100, "Anshika"));
		
		String st = m.get(100);
		System.out.println(st);
		
		Set<Integer> ks = m.keySet();
		System.out.println(ks);
		
		Collection<String> vs = m.values();
		System.out.println(vs);
		
		Set<Entry<Integer, String>> es = m.entrySet();
		System.out.println(es);
		
		System.out.println(m.containsValue("Anshika"));
		System.out.println(m.containsKey(200));
	}

}

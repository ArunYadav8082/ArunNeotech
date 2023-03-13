package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class Demo5
{
	public static void main(String[] args) 
	{
		MyCamp c = new MyCamp();
		Object[] o = {10,20,30,40,50,60,70,80};
		Arrays.sort(o,c);
		for(Object s : o)
		{
			System.out.println(s);
		}
		
	}

}
 class MyCamp implements Comparator
 {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	 
 }

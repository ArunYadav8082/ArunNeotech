package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int[] a = {3,5,4,3,2,2,1,3,2};
		
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int no:a)
		{
			Integer count = hm.get(no);
			//System.out.println("count"+count);
			if(count==null)
			{
				hm.put(no, 1);
			}
			else
			{
				count = count+1;
				hm.put(no, count);
			}
		}
		
	
		Set<Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer,Integer> me:es)
		{
			if(me.getValue()>1)
			{
				 System.out.print(" "+me.getKey() );
			
			}
		}
		
	}

}

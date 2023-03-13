package Collection;
import java.util.*;
import java.util.stream.Collectors;

public class Demo3
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Arvind Yadav");
		al.add("Arun Yadav");
		al.add("Abhay Yadav");
		al.add("Sanjeev Pal");
		al.add("Bhupesh Yadav");
		al.add("Jitendra Saini");
		al.add("Mohit Yadav");
		
		Comparator< String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1>l2)
			{
				return +1;
			}
			else if (l1<l2) 
			{
				return -1;
			}
			else
				return s1.compareTo(s2);
		};
			
			
		List<String> list = al.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println("Sorted list Accending name length order");
		System.out.println(list);
	}

}

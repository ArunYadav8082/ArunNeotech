package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class B {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vipin Yadav");
		al.add("Bhupesh Yadav");
		al.add("Abhay Yadav");
		al.add("Mohit Yadav");
		al.add("Arvind Yadav");
		al.add("Avishank Yadav");
		System.out.println(al);
		
		System.out.println("********************************");
		
		Comparator<String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1>l2)
			{
				return +1;
			}
			else if(l1<l2)
			{
				return -1;
			}
			else
			{
				return s1.compareTo(s2);
				
			}
		};
		
		List<String> list = al.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(list);
	}

}

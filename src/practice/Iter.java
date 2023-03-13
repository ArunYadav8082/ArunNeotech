package practice;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Iter {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =1; i<=20; i++)
		{
			al.add(i);
			
		}
	List<Integer> list	= al.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println(list);
	
	System.out.println("*********************************");
	
    List<Integer> list1	= al.stream().map(i->i+2).collect(Collectors.toList());
    
    System.out.println(list1);
    
    System.out.println("*************************************");
    
         List<Integer> list2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
         
         System.out.println(list2);
    
    
		

	}

}

package practice;
import java.util.*;
public class Example2
{
	public static void main(String[]args)
	{
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	for(int i=1;i<=10;i++)
	{
		al.add(i);
		
	}
     System.out.println(al);
     Iterator itr = al.iterator();
     while(itr.hasNext())
     {
       Integer n = (Integer) itr.next();
    	 if(n%2==0)
    	 {
    	 
    		 System.out.println(al);
    	 }
    	 else {
    	 
    		 itr.remove();
    	 } 
    	 
     }
    
	}
}



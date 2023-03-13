package practice;
import java.util.*;

public class Example 
{
	public static void main(String[]args)
	{
		ArrayList<String> al = new ArrayList<String>();
        al.add("Abhay Yadav");
        al.add("Lalu Yadav");
        al.add("Aditya Yadav");
        al.add("Arun Yadav");
        al.add("Vipin Yadav");
        al.add("Vivek Yadav");
        al.add("Vinay Yadav");
        al.add("Bhupesh Yadav");
        
        System.out.println(al);
        
        if(al.contains("Bhupesh Yadav"))
        {
        	System.out.println("Found the persion & Hey bro can i help you");
        }
        else
        {
        	System.out.println("There is no such persion");
        }
        Collections.sort(al);
        System.out.println(al);
        
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        
        
        
    
	}

}

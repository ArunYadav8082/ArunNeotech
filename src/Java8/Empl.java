package Java8;
import java.util.ArrayList;
import java.util.function.*;

import javax.swing.event.PopupMenuListener;

public class Empl
{
	String name;
	int salary;
	
	public Empl(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}
   class Tree
   {
	public static void main(String[]args)
	{
		ArrayList<Empl> l = new ArrayList<Empl>();
		populate(l);
	

	
	BiConsumer<Empl, Integer> c = (e,i)->e.salary=e.salary+i;
	for(Empl e : l)
	{
		c.accept(e, 500);
		
	}
	for(Empl e :l)
	{
		System.out.println("Employee Name : "+e.name);
		System.out.println("Employee Salary : "+e.salary);
		
		
	}
	}
	
	private static void populate(ArrayList<Empl> l) 
	
	{
		l.add(new Empl("Arun",10000));
		l.add(new Empl("Abhay",60000));
		l.add(new Empl("Aditya",15000));
		l.add(new Empl("Bhupesh",40000));
		l.add(new Empl("Mohit",30000));
		System.out.println();
	}

	
	
	}	
	
	
	
	
	



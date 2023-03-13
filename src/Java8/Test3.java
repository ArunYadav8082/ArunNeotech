package Java8;

import java.util.ArrayList;
import java.util.function.*;

class Employee1
{
	String name;
	float salary;
	
	public Employee1(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}

public class Test3 {

	public static void main(String[] args) 
	{
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1("Abhay Yadav",4000));
		l.add(new Employee1("Arun Yadav",6000));
		l.add(new Employee1("Vipin Yadav",5000));
		l.add(new Employee1("Aditya Yadav",7000));
		l.add(new Employee1("Bhupesh Yadav",3000));
		
		Predicate<Employee1> p = e->e.salary>5000;
		
		for(Employee1 e1:l)
		{
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
			}
			
		}
	}

}

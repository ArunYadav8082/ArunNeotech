package Java8;
import java.util.ArrayList;
import java.util.function.*;

public class Emp
{
	private int eno;
	private String name;
	
	

	public Emp(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}



	public static void main(String[]args)
	{
		ArrayList<Emp> l = new ArrayList<Emp>();
		BiFunction<Integer, String, Emp> f = (eno,name)->new Emp(eno, name);
	  l.add(f.apply(100, "Abhay"));
	  l.add(f.apply(150, "Arun")); 
	  l.add(f.apply(200, "Aditya"));
	  l.add(f.apply(300, "Bhupesh"));
	  
	  for(Emp e :l)
	  {
		  System.out.println("Employee Numer : "+e.eno);
		  System.out.println("Employee Name  : "+e.name);
		  System.out.println();
		  
	  }
	}
	
	}
		








package oops;

public class Students
{
	int id;
	String name,course;
	float fees;
	
	public Students(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	Students(int id,String name ,String course,float fees)
	{
		// this is invoke the current class constuructors
		
		this(id,name,course);
		this.fees = fees;
		
	}
	void display()
	{
		System.out.println(id+":"+name+":"+course+":"+fees);
	}
}
   class Tree
   {
	   public static void main(String[]args)
	   {
		   Students s1 = new Students(10,"Abhay Yadav","Machine Desighn");
		   Students s2 = new Students(20,"Arun Yadav","Matrial Science",4000);
		   Students s3 = new Students(30,"Bhupesh Yadav","Manufacturing",5000);
		   
		   s1.display();
		   s2.display();
		   s3.display();
		   s3.hashCode();
		   
	   }
   }













	
	



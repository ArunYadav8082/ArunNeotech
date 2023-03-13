package oops;

public class Student6
{
	int id;
	String name;
	static String college = "MANIT";
	
	public Student6(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+":"+name+":"+college);
	}
}
  class Test6
  {
	  public static void main(String[]arggs)
	  {
		  Student6 s1 = new Student6(10,"Arun Yadav");
		  Student6 s2 = new Student6(20,"Abhay Yadav");
		  Student6 s3 = new Student6(30,"Bhupesh Yadav");
		  
		  s1.display();
		  s2.display();
		  s3.display();
		  
	  }
  }

  
  
  
  
  
  
  


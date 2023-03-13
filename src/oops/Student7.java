package oops;

public class Student7
{
	int id;
	String name;
	static String college = "AKTU";
	
	// static methods can change the static variable value
	static void change()
	{
		college = "MANIT";
	}

	public Student7(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+":"+name+":"+college);
	}
}

  class Test7
  {
	  public static void main(String[]args)
	  {
		  
		  // calling the static methods
		  
		  Student7.change();
		  
		  Student7 s1 = new Student7(10,"Abhay Yadav");
		  Student7 s2 = new Student7(20,"Mohit Yadav");
		  Student7 s3 = new Student7(30,"Lalu Yadav");
		  Student7 s4 = new Student7(40,"Bhupesh Yadav");
		  
		  s1.display();
		  s2.display();
		  s3.display();
		  s4.display();
	  }
  }

















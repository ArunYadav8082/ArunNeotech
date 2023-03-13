package oops;

public class Student5 
{
	int id;
	String name;
	int age;
	
	public Student5(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// constructor overloding

	public Student5(int id, String name, int age) {
		/*super();
		this.id = id;
		this.name = name;
		this.age = age;*/
		this( id,  name);
		this.age = age;
	}
	void display()
	{
		System.out.println(id+":"+name+":"+age);
	}
}
  class Test5
  {
	  public static void main(String[]args)
	  {
		  Student5 s1 = new   Student5(11,"Abhay Yadav",15);
		  Student5 s2 = new   Student5(12,"Lalu Yadav",14);
		  Student5 s3 = new   Student5(13,"Arun Yadav",25);
		  
		  s1.display();
		  s2.display();
		  s3.display();
	  }
  }
















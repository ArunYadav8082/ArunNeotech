package oops;

// default constuctor provide by jvm intializing default null value

public class Student3
{
	int roll;
	String name;
	
	void display()
	{
		System.out.println(roll+":"+name);
	}

}
class Test3
{
	public static void main(String[]args)
	{
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		
		s1.display();
		s2.display();
	}
}

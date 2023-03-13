package oops;


// intialization object through methods

public class Student
{
	int id;
	String name;
	
	void insertRecord(int r,String n)
	{
		id = r;
		name = n;
	}
	void display()
	{
		System.out.println(id+":"+name);
	}
}
	class Test1
	{
		public static void main(String[]args)
		{
			Student s1 = new Student();
			Student s2 = new Student();
			
			s1.insertRecord(100,"Abhay");
			s2.insertRecord(200,"Arun");
			s1.display();
			s2.display();
		}
	}


	
	


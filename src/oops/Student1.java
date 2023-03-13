package oops;

public class Student1
{
	// initializing object through method
	int id;
	String name;
	float salary;
	
	void insertRecord(int r,String n,float s)
	{
		id = r;
		name = n;
		salary = s;
	}
	void display()
	{
		System.out.println(id+":"+name+":"+salary);
	}

}
 class Demo
 {
	 public static void main(String[]args)
	 {
		 Student1 s1 = new Student1();
		 Student1 s2 = new Student1();
		 
	   s1.insertRecord(11, "Abhay", 40000);
	   s2.insertRecord(12, "Arun", 30000); 
	   
	   s1.display();
	   s2.display();
	 }
 }


















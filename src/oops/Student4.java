package oops;

//  creating parametrized consturtors

public class Student4 
{
	int id;
	String name;
	
	public Student4(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+":"+name);
	}
	

}
class Test4
{
	public static void main(String[]args)
	{
		Student4 s1= new Student4(11,"Abhay Yadav");
		Student4 s2= new Student4(15,"Arun Yadav");
		Student4 s3= new Student4(14,"Aditya Yadav");
		
		s1.display();
		s2.display();
		s3.display();
	}
}








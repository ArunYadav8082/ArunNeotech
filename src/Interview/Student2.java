package Interview;

public class Student2
{
	String name;
	int id;
	
	Student2(String name , int id)
	{
		this.name = name;
		this.id = id;
	}
	public int hashCode()
	{
		return id;
	}
	public static void main(String[] args)
	{
		Student2 s1 = new Student2("Abhay Yadav",100);
		Student2 s2 = new Student2("Aditya Yadav",200);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}

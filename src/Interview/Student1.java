package Interview;

public class Student1
{
	String name;
	int id;
	
	Student1(String name ,int id)
	{
		this.name = name;
		this.id = id;
	}
	/*public String toString()
	{
		return id+" : "+name;
	}*/
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1("Abhay",100);
		Student1 s2 = new Student1("Abhay",100);
		
		//System.out.println(s1);
		System.out.println(s1==s2);
	}

}

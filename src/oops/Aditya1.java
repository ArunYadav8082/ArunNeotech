package oops;

public class Aditya1 {
	
	// constructor overloading or reusing constructors
	
	int rollno;
	String name;
	String course;
	float fees;
	
	Aditya1(int rollno,String name ,String course)
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	Aditya1(int rollno,String name,String course,float fees)
	{
		this(rollno,name,course);  // reusing constructors
		this.fees = fees;
	}
	
	void display()
	{
		System.out.println(rollno+":"+name+":"+course+":"+fees);
	}
	
	public static void main(String[] args) {
		
		Aditya1 a = new Aditya1(100,"Arun Yadav","Mechanical",1000);
		Aditya1 a1 = new Aditya1(200,"Bhupesh Yadav","Mechanical",5000);
		Aditya1 a2 = new Aditya1(600,"Lalu Yadav","Mechanical",9000);
		
		a.display();
		a1.display();
		a2.display();
	}
	
	

}

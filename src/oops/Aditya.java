package oops;

public class Aditya {
	
	int rollno;
	String name;
	
	void insert(int r,String n)
	{
		rollno = r;
		name = n;
	}
	
	void display()
	{
		System.out.println(rollno+" :"+name);
	}
	
	public static void main(String[] args) {
		
		Aditya a = new Aditya();
		Aditya a1 = new Aditya();
		a.insert(100, "Arun Yadav");
		a1.insert(200, "Bhupesh Yadav");
		
		a.display();
		a1.display();
	}

}

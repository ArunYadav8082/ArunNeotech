package oops;

class Student2
{
	int sid;
	String name;
	String subj;
	
	public Student2(int sid, String name, String subj) {
		super();
		this.sid = sid;
		this.name = name;
		this.subj = subj;
	}
	void display()
	{
		System.out.println(sid+":"+name+":"+subj);
	}

	
}

public class Test 

{
	public static void main(String[]args)
	{
		Student2 s1 = new Student2(100,"Arun Yadav","Machine Design");
		Student2 s2 = new Student2(200,"Abhay Yadav","Production Engg.");
		Student2 s3 = new Student2(300,"Bhupesh Yadav","Manufacturing Process");
		s1.display();
		s2.display();
		s3.display();
	}
	
	


	

}

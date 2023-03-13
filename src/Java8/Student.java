package Java8;

import java.util.ArrayList;
import java.util.Collections;

public class Student
{
	public static final String marks = null;
	String name;
	int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}
class Sudo
{
	public static void main(String[]args)
	{
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student("Abhay Yadav",100));
		l.add(new Student("Lalu Yadav",400));
		l.add(new Student("Aditya Yadav",300));
		l.add(new Student("MohitYadav",200));
		l.add(new Student("Arun Yadav",500));
		
		Collections.sort(l,(s1,s2)->(s1.id<s2.id)?-1:(s1.id>s2.id)?1:0);
		System.out.println(l);
		// if we want to print student according to alphabatical order
		
		System.out.println("<------------------------------------------------>");
		Collections.sort(l,(s1,s2)->s1.name.compareTo(s2.name));
		System.out.println(l);
	}
}
	



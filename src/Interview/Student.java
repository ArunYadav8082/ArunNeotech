package Interview;

import java.lang.Object;
import java.lang.String;
import java.lang.System;

public class Student
{
	String name;
	int rollno;
	
	Student(String name ,int rollno)
	{
		this.name = name;
		this.rollno= rollno;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student s = (Student) obj;
			
			if(name.equals(s.name)&& rollno == s.rollno)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		Student s1 = new Student("Abhay",100);
		Student s2 = new Student("Abhay",100);
		
		System.out.println(s1.equals(s2));
		
		
	}

}

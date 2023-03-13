package oops;

// static final variables initialize through static blocks only

public class Student9 
   { 
	static final int speed;
	
	static
	{
		speed = 100;
	}

	public static void main(String[] args)
	{
		System.out.println(Student9.speed);
	
	}
 
}

package oops;

class Saini{
	
	float salary = 4000;
}

public class Aditya2 extends Saini
{
	int bonous = 1000;
	
	public static void main(String[] args) {
		
		Aditya2 a = new Aditya2();
		
		System.out.println(a.salary);
		System.out.println(a.bonous);
	}
	

}

package Interview;

public class Arun implements A,B
{

	@Override
	public void m2() {
	
		System.out.println("Interface A");
		
	}

	@Override
	public void m1() {
		
		System.out.println("Interface A");
		
	}
	
	public void display()
	{
		System.out.println("Arun Class");
	}
	
	public static void main(String[] args) {
		
		Arun ar = new Arun();
		
		ar.display();
		ar.m1();
		ar.m2();
	}

}

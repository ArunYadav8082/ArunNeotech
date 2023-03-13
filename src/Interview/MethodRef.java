package Interview;

public class MethodRef 
{
	public static void m1()
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println("Child Tread");	
		}
		
	}
	public static void main(String[] args)
	{
		Runnable r = MethodRef::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i = 1; i<=5; i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}

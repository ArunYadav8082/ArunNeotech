package Interview;

public class MethodReff 
{
	public void m1()
	{
		for(int i =1; i<=5; i++)
		{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) 
	{
		MethodReff mr = new MethodReff();
		Runnable r = mr::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i = 1; i<=5; i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}

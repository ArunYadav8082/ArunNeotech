package Multithreading;

public class CaseStudy implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		CaseStudy cs = new CaseStudy();
		Thread t = new Thread();
		Thread t1 = new Thread(cs);
		
		t.start(); 
		//t1.start();
		
		for(int i=1; i<=5;i++)
		{
			System.out.println("main Thread");
		}
	}

}

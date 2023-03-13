package Multithreading;

public class Test10 extends Thread
   {
	public void run()
	{
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());
	//	System.out.println(Thread.currentThread().isInterrupted());
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(3000);
			}
			
		} catch (Exception e)
		{
			
		}
	}

	public static void main(String[] args)
	{
		Test10 t = new Test10();
		t.start();
		t.interrupt();
		

	}

}

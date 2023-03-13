package Multithreading;



public class Test9 extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(3000);
			
			}
		}
			catch (Exception e)
		{
				e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args)
	{
		Test9 t = new Test9();
		t.start();
		t.interrupt();
		
	}

}

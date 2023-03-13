package Multithreading;

public class Test7 extends Thread
{
	static Thread mainthread;
	public void run()
	{
		try {
			mainthread.join();
			for(int i=1;i<=10; i++)
			{
				System.out.println("Child Thread :"+"   "+i);
				Thread.sleep(5000);
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args)
	{
		mainthread = Thread.currentThread();
		
		Test7 t = new Test7();
		t.start();
		
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println("Main Thread :"+"  "+i);
				Thread.sleep(5000);
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

}

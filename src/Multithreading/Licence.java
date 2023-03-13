package Multithreading;

class Medical extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Medical Start");
			Thread.sleep(5000);
			System.out.println("Medical completed");
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
}
class TestDrive extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Drving Test Start");
			Thread.sleep(5000);
			System.out.println("Driving Test Completed");
			
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
class Officer extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Officer takes File");
			Thread.sleep(5000);
			System.out.println("Officer checked the File");
			
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
}

public class Licence {

	public static void main(String[] args) throws InterruptedException 
	{
		Medical m = new Medical();
		m.start();
		m.join();
		
		TestDrive td = new TestDrive();
		td.start();
		td.join();
		
		Officer of = new Officer();
		of.start();
				
	
	}

}

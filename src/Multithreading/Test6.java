package Multithreading;

class Saini extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread:"+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test6 {



	public static void main(String[] args) throws InterruptedException
	
	{
		
		
		Saini s = new Saini();
		s.start();
		s.join();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread :"+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


		
	}



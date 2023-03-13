package DurgaMultiThreading;

public class IntrrTest extends Thread
{
	public void run()
	{
		try {
			for(int i = 1; i<=10; i++)
			{
				System.out.println("I am lazy Thread");
				Thread.sleep(100);
			}
			
		} catch (InterruptedException e) {
			
			System.out.println("I got Interrupted");
		}
		
	}
	 public static void main(String[] args) {
		
		 IntrrTest t = new IntrrTest();
		 
		 t.start();
		 t.interrupt();
		 
		 System.out.println("End Of MainThread");
	}
	

}

package Interview;

public class MultiThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable r = ()->{
			
			for(int i = 1; i<=5; i++)
			{
			
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				System.out.println("Child Thread");
			}
			
		};
		Thread t = new Thread(r);
		t.start();
		for(int i = 1; i<=5; i++)
		{
			Thread.sleep(3000);
			System.out.println("Main Thread");
		}
   }

}

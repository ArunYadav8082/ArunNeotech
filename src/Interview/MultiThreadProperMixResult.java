package Interview;

public class MultiThreadProperMixResult extends Thread
{
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			try {
	
				Thread.sleep(2000);
				  Thread.interrupted();
				System.out.println(i);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
     public static void main(String[] args) {
		
	
		MultiThreadProperMixResult m = new MultiThreadProperMixResult();
		
		m.start();
      //  m.onSpinwait();
	for(int i = 1; i<=5 ; i++)
	{
	
			try {
				Thread.sleep(2000);
				System.out.println("0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	}





package DurgaMultiThreading;

public class OverrideStartMethod extends Thread 
{
	public void start()
	{
		super.start();
		System.out.println("Start Methods");
	}
	
	public void run()
	{
		System.out.println("Run Methods");
	}
	
	public static void main(String[] args) {
		
		OverrideStartMethod om = new OverrideStartMethod();
		om.start();
		
		System.out.println("main methods ");
		
	}

}

package Multithreading;

public class Test8 extends Thread
 {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() +" : "+i);
		
		}
	}
	

	public static void main(String[] args)
	{
		Test8 t = new Test8();
		t.start();
		Thread.yield();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	
	}

} 

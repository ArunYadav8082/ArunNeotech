package Multithreading;

public class Thread0 extends Thread

{
 public void run()
 {
	 System.out.println(Thread.currentThread().getName()+" "+"Child");
	 System.out.println(Thread.currentThread().getPriority()+" "+"Child");
 }

	public static void main(String[] args) throws InterruptedException
	
{
		Thread0 t = new Thread0();
		t.start();
		t.join();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		

	}

}

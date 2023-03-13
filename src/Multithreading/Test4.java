package Multithreading;

class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("Welcome :"+" "+ Thread.currentThread().getName());
	}
}

public class Test4 {
	
	public static void main(String[]args)
	{
		System.out.println("Hello :"+" "+ Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		Demo2 d1 = new Demo2();
		d1.setName("Abhay");
		d1.start();
		
		Demo2 d2 = new Demo2();
		d2.setName("Arun");
		d2.start();
		
		System.out.println(Thread.currentThread().isAlive());
		
	}

}

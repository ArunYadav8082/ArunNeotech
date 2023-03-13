package Multithreading;

class Demo extends Thread
{
	public void run()
	{
		System.out.println("Welcome");
	}
	
}
class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}

public class Test2 extends Thread
{
	public static void main(String[] args)
	{
	Demo d = new Demo();
	d.start();
	
	Demo1 d1 = new Demo1();
	d1.start();
	}

	


}

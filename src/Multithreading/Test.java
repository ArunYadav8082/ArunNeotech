  package Multithreading;

public class Test implements Runnable

{
	public void run()
	{
		System.out.println("Welcome");
	}
	public static void main(String[]args)
	{
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
	}

}

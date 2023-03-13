package Multithreading;

public class Test3 {

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("<----------------------------------->");
		
		Thread.currentThread().setName("Abhay");
		
		System.out.println(Thread.currentThread().getName());
		
	}

}

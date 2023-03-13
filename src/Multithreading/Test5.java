package Multithreading;

 class Deamon extends Thread
 {
	 public void run()
	 {
		 System.out.println("Child Thread");
		 System.out.println(Thread.currentThread().getPriority());
		 System.out.println(Thread.currentThread().isAlive());
		 System.out.println(Thread.currentThread().isDaemon());
	 }

  
 }

public class Test5 {

	public static void main(String[] args) {
		Deamon d = new Deamon();
		
		d.setDaemon(true);
		d.isDaemon();
		d.start();
		
		
		System.out.println("Hello India I am Arun Yadav :"+"    "+ Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority()+" : Main  ");
		
	}

}

package DurgaMultiThreading;

class Display
{
	public synchronized void wish(String name)
	{
		System.out.print("good morning");
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(name);
	}
}

 class MyThread extends Thread
 {
	 Display d;
	 String name;
	 
	 MyThread(Display d , String name)
	 {
		 this.name = name;
		 this.d = d;
	 }
	 
	 public void run()
	 {
		 d.wish(name);
	 }
 }

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Surya");
		
		t1.start();
		t2.start();
	}

}

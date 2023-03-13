package DurgaMultiThreading;

class Display1
{
	public static synchronized void wish(String name)
	{
		for(int i=1; i<= 5; i++) {
			
			System.out.print("Good Morning"+":");
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	
		
	}
}
 class MyThrad extends Thread
 {
	 Display1 d;
	 String name;
	 
	 MyThrad(Display1 d , String name)
	 {
		 this.d = d;
		 this.name = name;
	 }
	 
	 public void run()
	 {
		 d.wish(name);
	 }
 }

public class StaticSynchronization {

	public static void main(String[] args) {
		
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		
		MyThrad t1 = new MyThrad(d1,"Dhoni");
		
		MyThrad t2 = new MyThrad(d2,"Surya");
		
		t1.start();
		t2.start();
		
	}
}

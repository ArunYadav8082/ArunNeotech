package DurgaMultiThreading;

public class Test extends Thread
{
	 public void run() {
		System.out.println("NO-Arguments Methods");
	}
	
	public void run(int i)
	{
		System.out.println("Int-Arguments Methods");
	}
	
	public static void main(String[] args) {
		
		Test t =  new Test();
		t.start();
	}

}

package Java8;

public class Test {

	public static void main(String[] args) {
		
		Runnable r =()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread");
			}
		};
		Thread th = new Thread(r);
		th.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
		}
		

	}

}

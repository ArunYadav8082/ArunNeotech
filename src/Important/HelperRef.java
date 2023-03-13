package Important;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class HelperRef {
	
	public static void dostuff()
	{
		System.out.println("I am working proper Task");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println("---------------");
		
		for(int i =1;i<=10; i++)
		{
			System.out.println(" "+2*i);
		}
		System.out.println("---------------------------");
	}
	
	public static void threadTask()
	{
		System.out.println("I am generating Otp");
		
		Supplier<String> s = ()->{
			
			String otp = "";
			
			for(int i =1; i<7;i++)
			{
			otp	= otp+(int)(Math.random()*10);
			}
			return otp;
			
		};
		
		System.out.println(s.get());
	}

	public void childThread() 
	{
		
		for(int i=1; i<=5;i++)
		{
			try {
				
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName());
				
			} catch (Exception e) {
				System.out.println("I got Exception");
			}
			
		}
		
	}
	
	public void primeNumber()
	{
		
		System.out.println("***************************");
		for(int no =1; no<=100; no++)
		{
			int temp = 0;
			
			for(int i =2; i<=no-1; i++)
			{
				if(no%i==0)
				{
					temp = temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no);
			}
		}
	}
}

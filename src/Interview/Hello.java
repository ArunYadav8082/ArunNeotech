package Interview;

public class Hello 
{
	public static void main(String[] args) throws InterruptedException 
	{
		for(int i= 1; i<=5; i++)
		{
			System.out.println("Hello :"+ i);
			Thread.sleep(2000);
		}
		
	}

}

package Exception;

public class Test1
{
	public static void main(String[] args) 
	{
		doStuff();
		

	}

	private static void doStuff() {
		doMoreStuff();
		System.out.println(10/0);
	}

	private static void doMoreStuff() {
		
		System.out.println("Hello");
		
	}

}

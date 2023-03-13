package oops;

class Bike
{
	// final method can not override but inherit also
	final void run()
	{
		System.out.println("Bike is running");
	}
}

public class Honda extends Bike
{
   public static void main(String[] args) {
	
	   Honda h = new Honda();
	   h.run();
}
}

package oops;

public class Reverse 
{
	public static void main(String[] args) 
	{
		int rev = 0 , rem = 0;
		int no = 54321;
		while(no!=0)
		{
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
		System.out.println(rev);
		
	}

}
package practice;

public class Star3
{
	public static void main(String[]args)
	{
		for(int i =1;i<=15; i++)
		{
			for(int j=14; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

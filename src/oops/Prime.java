package oops;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter number");
		int no = s.nextInt();
		//int no = 7;
		int temp = 0;
		for(int i = 2; i<=no-1; i++)
		{
			if(no%i==0)
			{
				temp = temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("No is not Prime");
		}
		else
		{
			System.out.println("No is prime");
		}
		
	}

}

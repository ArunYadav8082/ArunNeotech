package practice;

import java.util.Scanner;

public class Even {

	public static void main(String[] args)
{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		int no = s.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number");
			
		}
		else
		{
			System.out.println("Odd Number");
		}
		

	}

}

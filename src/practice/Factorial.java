package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Numbers");
		int no = s.nextInt();
		int fact = 1;
		for(int i =1; i<=no; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	
	}

}

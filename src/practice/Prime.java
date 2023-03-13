package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Number");
		int no = s.nextInt();
		int temp = 1;
		for(int i =2; i<=no-1; i++)
		{
			if(no%i==0)
			{
				temp = temp+1;
				
			}
		}
		
		if(temp>1)
		{
			System.out.println("Number is not Prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}
		
		
	

	}

}

package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s = new  Scanner(System.in);
		System.out.println("Enter your Number");
		int no = s.nextInt();
		
		int temp = no;
		int rev = 0, rem;
		
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
			
		}
	
		if(rev==no)
		{
			System.out.println("no. is plaindrome");
		}
		else
		{
			System.out.println("not plaindrome");
		}
	}

}

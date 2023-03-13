package practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = s.next();
		int leng = name.length();
		
		String rev =" ";
		for(int i = leng-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
			
		}
		
		System.out.println("Revese of Name " + " " + rev);
	}
	

}

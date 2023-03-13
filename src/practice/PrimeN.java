package practice;

import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter your Number");
		int no = s.nextInt();
		for(int i = 1; i<=no; i++)
		{
			int temp = 0;
			for(int j = 2; j<=i-1; j++)
			{
				if(i%j==0)
				{
					temp = temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		}

	}

}

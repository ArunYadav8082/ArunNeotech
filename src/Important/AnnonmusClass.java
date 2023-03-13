package Important;

import java.util.Scanner;

public class AnnonmusClass {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Here Year");
				
				int year = sc.nextInt();
				
				if((year%400==0) ||(year%4==0 && year%100!=100))
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not Leap Year");
				}
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
	}

}

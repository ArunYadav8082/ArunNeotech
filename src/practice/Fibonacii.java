package practice;

public class Fibonacii {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
	//	System.out.println(a+" "+b);
		int c;
		for(int i =0; i<=10;i++)
		{
			c = a+b;
			a = b;
			b= c;
			System.out.println(c);
		}
	

	}

}
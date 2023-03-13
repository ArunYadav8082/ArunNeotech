package CoreJavaInterview;

public class Series1 {
	
	public static void main(String[] args) {
		
		int n= 3;
		
		for(int i=1; i<10;i++)
		{
			System.out.print(n+" ");
			n = n*2;
			
			if(n==1000)
			{
				break;
			}
			
		}
	
	}

}

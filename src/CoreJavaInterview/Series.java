package CoreJavaInterview;

public class Series {
	
	public static void main(String[] args) {
		
		int a[] = new int[10];
		a[0] = 3;
		
		for(int i =1;i<=a.length;i++)
		{
			if(a[i-1]<1000)
			{
				a[i] = a[i-1]*2;
			}
			else
			break;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}

}

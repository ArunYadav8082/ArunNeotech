package practice;

public class Test 
{
	public static void main(String[] args) {
	
		int[] a= {4,5,2,1,2,8};
		int max = a[0];
	   for(int i=0;i<=a.length-1;i++) {
	    	

		   if(a[i]>max)
		   {
			   max=a[i];
		   }
	   }
		
		System.out.println("max is: "  + max);
		
	}

}

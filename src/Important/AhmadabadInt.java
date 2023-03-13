package Important;

public class AhmadabadInt {
	
	public static void main(String[] args) {
		int count=0;
		for(int i=10;i<=100;++i)
		{
			if(i%2==0 && i%3==0)
			{
				count++;
				System.out.println(i+" "+count);
			}
			if(count==10)
			{
				break;
			}
		}
	}

}

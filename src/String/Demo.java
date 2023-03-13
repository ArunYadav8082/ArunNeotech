package String;

public class Demo
{
	public static void main(String[] args) 
	{
		final StringBuffer sb = new StringBuffer("Abhay");
		System.out.println(sb.capacity());
		sb.append("Yadav");
		System.out.println(sb);
		//sb = new StringBuffer("Lucknow");
		System.out.println(sb);
		
	}

}

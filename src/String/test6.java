package String;

public class test6 {

	public static void main(String[] args)
	{
		String s1 = "Arun";
		String s2 = "arun";
		String s3 = " ";
		
		System.out.println(s1.compareTo(s2));
		System.out.println("<---------------------->");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s2.compareToIgnoreCase(s3));
		

	}

}

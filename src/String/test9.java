package String;

public class test9 {

	public static void main(String[] args) 
	{
		String s1 = "This is a issmall and is very good";
		
		System.out.println(s1.replace("is", "are"));
		System.out.println(s1.replaceFirst("is", "was"));
		System.out.println(s1.replaceAll("is", "was"));
		
	}

}

package Important;

public class StringTest {
	
	public static void main(String[] args) {
		
		String s1 = "Arun";
		
		String s2 = "Arun";
		
		String s3 = new String("Arun");
		
		StringBuffer sb1 = new StringBuffer("Arun");
		StringBuffer sb2 = new StringBuffer("Arun");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		//System.out.println(s1==sb1);
		
		System.out.println("*******************************");
		
		System.out.println(s1.equals(sb1));
	}

}

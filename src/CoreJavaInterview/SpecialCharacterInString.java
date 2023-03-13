package CoreJavaInterview;

public class SpecialCharacterInString {
	
	public static void main(String[] args) {
		
		String s = "ArunYadav@&#*";
		
		int count = 0;
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
			              && !Character.isWhitespace(s.charAt(i)))
			{
				count++;
				
		     }
		}
		if(count==0)
		{
			System.out.println("There are no Special Characters in String");
		}
		else
		{
			System.out.println("special Characters is :"+count);
		}
			
			
	}

}

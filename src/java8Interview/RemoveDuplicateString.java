package java8Interview;

import java.util.Arrays;
import java.util.stream.Collectors;



/// no working
public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		
	String str = "ACBDFEABCSGTRSDCVR";
	
	String newStr = Arrays.stream(str.split("")).sorted().distinct().collect(Collectors.joining());
	System.out.println(newStr);
	}

}

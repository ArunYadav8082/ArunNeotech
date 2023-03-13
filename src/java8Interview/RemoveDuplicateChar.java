package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		
		Character[] ch = {'A','D','E','B','F','C','H','G','A','C','F'};
		
		List<Character> list = Arrays.asList(ch);
		
		List<Character> list2 = list.stream().sorted().distinct().collect(Collectors.toList());
		
		Object[] arr = list2.toArray();
		
		for(Object chh:arr)
		{
			System.out.print(" "+chh);
		}
		
		/*Character[] arr = list.stream().sorted().distinct().toArray(size-> new Character[size]);
		for(Character ar : arr)
		{
			System.out.print(" "+ar);
		}*/
	}

}

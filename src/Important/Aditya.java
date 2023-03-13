package Important;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Aditya {
	
	// if we want to sorting to increasing length
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Abhay");
		al.add("Aditya");
		al.add("Sanjeev");
		al.add("BhupeshYadav");
		al.add("ArunAhir");
		al.add("VipinYadav");
		
		Comparator<String> c = (s1,s2)->{
			
			int l1 = s1.length();
			int l2 = s2.length();
			
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		
		al.stream().sorted(c).collect(Collectors.toList()).forEach(e->System.out.println(e));
	}

}

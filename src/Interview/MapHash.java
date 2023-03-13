package Interview;

import java.util.HashMap;

public class MapHash 
{
	public static void main(String[] args) {
		
	
	HashMap<String, Integer> hsh = new HashMap<String, Integer>();
	hsh.put("Arun", 100);
	hsh.put("Abhay", 200);
	hsh.put("Aditya", 100);
	hsh.put("Arun", 200);
	System.out.println(hsh);
	
}
}

package Important;

import java.util.Arrays;
import java.util.HashSet;

public class MissingElementAnArray {
	
	public static void main(String[] args) {
		
	 	  int[] a = {9, 6, 4, 5, 7, 0, 1};
		    Arrays.sort(a);
		    HashSet<Integer> set = new HashSet<>();

		    for (int i = a[0]; i <a[a.length - 1]; i++) {
		        set.add(i);
		    }

		    for (int i = 0; i < a.length-1; i++) {
		        set.remove(a[i]);
		    }

		    for (int x : set) {
		        System.out.print(x + " ");
		    }
		}
	}



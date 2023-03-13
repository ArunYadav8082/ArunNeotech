package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(0);
		
		//Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		/*Comparator<Integer> c = (i1,i2)->i1.compareTo(i2);
		Collections.sort(l,c);
		System.out.println(l);*/
		List<Integer> list = l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list);
	}

}

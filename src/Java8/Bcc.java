package Java8;
import java.util.*;

public class Bcc {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		
		al.stream().forEach(i->{
			System.out.println("The Squre :"+ i*i);
		});
	}
		

}

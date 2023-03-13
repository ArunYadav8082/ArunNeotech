package Collection;
import java.util.*;
import java.util.stream.Collectors;

public class Demo
{
	public static void main(String[] args) 
	{
		MyComp mc = new MyComp();
		ArrayList<Integer> al = new ArrayList();
		for(int i=1;i<=20;i++)
		{
			al.add(i);
		}
		System.out.println("ArrayList witout sorting");
		System.out.println(al);
		Collections.sort(al,mc);
		System.out.println("ArrayList with customized sorting order");
		System.out.println(al);
		System.out.println("______________________________________");
		
		List<Integer> list = al.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
		list.forEach(e->System.out.println(e));
	}

}
  class MyComp implements Comparator
  {

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	  
  }

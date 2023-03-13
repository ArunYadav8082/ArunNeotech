package java8Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestEmp {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		e1.setEmpId(10);
		e1.setName("Abhay Yadav");
		e1.setCity("Lucknow");
		e1.setSalary(40000);
		
		e2.setEmpId(20);
		e2.setName("Bhupesh Yadav");
		e2.setCity("Lucknow");
		e2.setSalary(50000);
		
		e3.setEmpId(30);
		e3.setName("Arun Yadav");
		e3.setCity("Lucknow");
		e3.setSalary(40000);
		
		e4.setEmpId(40);
		e4.setName("VipinYadav");
		e4.setCity("Bhopal");
		e4.setSalary(50000);
		
		e5.setEmpId(50);
		e5.setName("Lalu Yadav");
		e5.setCity("Sitapur");
		e5.setSalary(60000);
		
		ArrayList<Employee> al = new ArrayList();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
	       al.stream().
		         filter(e->e.getCity().startsWith("L"))
		         .collect(Collectors.toList())
		         .forEach(e->System.out.println(e));
			
    //   List<String> city = al.stream().map(e->e.getCity()).collect(Collectors.toList());
       
   /*    Set<String> dcity = new HashSet<String>();
       
       Set<String> set = city.stream().filter(e->!dcity.add(e)).collect(Collectors.toSet());
       System.out.println(set)*/;
       
/*       List<String> list = new ArrayList<String>();
       List<String> list2 = city.stream().filter(e->Collections.frequency(city, e)>1).collect(Collectors.toList());
       System.out.println(list2);*/
       
     
		
       
       
	}

}

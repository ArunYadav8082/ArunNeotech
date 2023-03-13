 package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teast {
	
	public static void main(String[] args) {
		
		Employe e1 = new Employe();
		Employe e2 = new Employe();
		Employe e3 = new Employe();
		Employe e4 = new Employe();
		Employe e5 = new Employe();
		
		e1.seteId(10);
		e1.setName("Arun");
		e1.setCity("Kanpur");
		e1.setGender(Gender.Male);
		e1.setSalary(10000);
		
		e2.seteId(20);
		e2.setName("Aditya");
		e2.setCity("Lucknow");
		e2.setGender(Gender.Male);
		e2.setSalary(20000);
		
		e3.seteId(30);
		e3.setName("Anshika");
		e3.setCity("Lucknow");
		e3.setGender(Gender.Female);
		e3.setSalary(30000);
		
		e4.seteId(40);
		e4.setName("Vipin");
		e4.setCity("Bhopal");
		e4.setGender(Gender.Male);
		e4.setSalary(40000);
		
		e5.seteId(50);
		e5.setName("Aastha Shukla");
		e5.setCity("Lucknow");
		e5.setGender(Gender.Female);
		e5.setSalary(50000);
		
		ArrayList<Employe> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		/*List<Double> list = al.stream().filter(e->e.getSalary()>10000)
		.map(e->e.getSalary()).collect(Collectors.toList());*/
		
		List<Employe> list = al.stream().map(e->
		{
			if(e.getSalary()>10000)
			{
				e.setSalary(e.getSalary()/10);
				
			}
			return e;
		}
		).collect(Collectors.toList());
		
		list.forEach(e->System.out.println(e));
		
	}

}
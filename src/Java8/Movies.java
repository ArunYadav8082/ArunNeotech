package Java8;

import java.util.function.*;


public class Movies

{
	String name;

	public Movies(String name) {
		super();
		this.name = name;
	}
	
}	
 class  Puspa
 {
	 public static void main(String[]args)
	 {
		
		Consumer<Movies> c1 = m->System.out.println(m.name+"dqsss");
		Consumer<Movies> c2 = m->System.out.println(m.name+"fgghhhhhhhhhhhhhhh");
		Consumer<Movies> c3 = m->System.out.println(m.name+"heyyyyyyyyyyyyyyyyy");
		
		Movies m = new Movies("Dangal");
		Consumer<Movies> cc = c1.andThen(c2).andThen(c3);
		
		//cc.accept(m);
		c1.accept(m);
		c2.accept(m);
		c3.accept(m);
		
		
	 }
 }
		
		
		
		
		
	
	




	

	
	

	
	


		





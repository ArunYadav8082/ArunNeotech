package Java8;

import java.util.function.*;

class Saini
{
	String name;

	public Saini(String name) {
		super();
		this.name = name;
	}
	
	
}

public class Mvs {

	private String name = "Dangal";

	public static void main(String[] args)
   {
		Consumer<Mvs> c1 = m->System.out.println(m.name+"dqsss");
		Consumer<Mvs> c2 = m->System.out.println(m.name+"fgghhhhhhhhhhhhhhh");
		Consumer<Mvs> c3 = m->System.out.println(m.name+"heyyyyyyyyyyyyyyyyy");
		
		Consumer<Mvs> cc = c1.andThen(c2).andThen(c3);
		
		Mvs m = new Mvs();
		cc.accept(m);
	
	}

}

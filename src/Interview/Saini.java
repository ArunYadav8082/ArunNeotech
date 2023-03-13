package Interview;

public class Saini {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.mary();
		
		Chield c = new Chield();
		c.mary();
		
		System.out.println("---------------------------");
		Parent p1 = new Chield();
		p1.mary();
	}

}

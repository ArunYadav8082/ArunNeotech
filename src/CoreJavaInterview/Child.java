package CoreJavaInterview;

public class Child extends Parent {

    @Override
	public int squre(int x) {
		
		return super.squre(x);
	}
	
	public int squre(float y)
	{
		return (int) (y*y);
		
	}
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		
		Child c = new Child();
		int j = c.squre(5);
		
		int i = p.squre(4);
		
		System.out.println(i);
		
		System.out.println(j);
	}

	
}

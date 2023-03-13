package CoreJavaInterview;



public class MultipleInheritenceDemo implements A,B
{

	@Override
	public void show() {
		
		System.out.println("Multiple Inheritance using Java Interface");
		
	}
	
	public void print() {
		
		A.super.insert();
		
		System.out.println("Hello India");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritenceDemo demo = new MultipleInheritenceDemo();
		
		demo.show();
		demo.print();
		
		System.out.println(A.x);
		
		/*A a = new MultipleInheritenceDemo();
		a.insert();*/
	}

}

package DesignPattern.singlton;

public class SingltonMain {
	
	public static void main(String[] args) {
		
		SingltonTest st1 = SingltonTest.getInstance();
		SingltonTest st2 = SingltonTest.getInstance();
		SingltonTest st3 = SingltonTest.getInstance();
		
		System.out.println("First Object"+" : "+ st1.toString());
		System.out.println("Second Object"+" : "+ st2.toString());
		System.out.println("Third Object"+" : "+ st3.toString());
	}

}

package DesignPattern.singlton;

public class SingltonTest {

	// make static object
	 static SingltonTest obj = new SingltonTest();
	 
	 // make private constructors
	 
	 private SingltonTest()
	 {
		 
	 }
	 
	 // make public & static method get instance
	 
	 public static SingltonTest getInstance()
	 {
		 return obj;
	 }
}

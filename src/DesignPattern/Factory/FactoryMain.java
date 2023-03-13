package DesignPattern.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		FactoryLaptop aLf = new FactoryLaptop();
		
		Laptop lp = aLf.getNewLaptop("fsdghsdahg");
		lp.getLaptopSpecification();
	}
}
    
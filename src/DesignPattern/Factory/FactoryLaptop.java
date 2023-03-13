package DesignPattern.Factory;

public class FactoryLaptop {
	
	public Laptop getNewLaptop(String name)
	{
		if(name.equals("Secured"))
			return new AppleLaptop();
		else if(name.equals("Orderd"))
			return new DellLaptop();
		else
			return new HpLaptop();
	}

}


package Interview;
abstract class Vehicle
{
	public abstract int getNoOfWheel();
	
}
class Bus extends Vehicle
{

	@Override
	public int getNoOfWheel() {
		return 6;
	}
	
}
class Auto extends Vehicle
{

	@Override
	public int getNoOfWheel() {
		return 3;
	}
	
}
public class Teste 
{
	public static void main(String[] args) 
	{
		Bus b = new Bus();
		System.out.println(b.getNoOfWheel());
		
		Auto a = new Auto();
		System.out.println(a.getNoOfWheel());
		
	}

}

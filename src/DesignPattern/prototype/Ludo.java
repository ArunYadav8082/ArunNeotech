package DesignPattern.prototype;

public class Ludo extends Game
{

	@Override
	public void playGame() {
	
		System.out.println("This is Ludo Game");
		System.out.println(" Ludo Game maximum four players play!!");
	}

	@Override
	public String toString() {
		return "Ludo [name=" + name + "]";
	}
	
	
	

}

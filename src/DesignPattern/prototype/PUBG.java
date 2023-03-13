package DesignPattern.prototype;

public class PUBG extends Game
{

	@Override
	public void playGame() {
		
		System.out.println("this is PUBG game");
		System.out.println(" PUBG game is multiple players play");
		
	}

	@Override
	public String toString() {
		return "PUBG [name=" + name + "]";
	}
	

}

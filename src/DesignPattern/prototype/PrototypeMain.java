package DesignPattern.prototype;

public class PrototypeMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Ludo ludo = new Ludo();
		ludo.setName("ludo");
		System.out.println(ludo);
		//ludo.setName("xyz");
		// shallow cloaning
		
		Ludo ludo2 = (Ludo) ludo.clone();
		
		System.out.println(ludo2);
	}

}

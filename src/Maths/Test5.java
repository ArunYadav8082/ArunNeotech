package Maths;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Test5
{
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		 SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		 
        System.out.println("Int SecureRandom value: " + (int)secureRandom.nextInt()*9);
	}

}

package File;

import java.io.File;

public class Test {

	public static void main(String[] args) throws Exception
	
	{
		File f = new File("C:\\arun123\\abc.txt");
		
		System.out.println(f.exists());
		
		f.createNewFile();
		
		System.out.println(f.exists());
	
	}

}

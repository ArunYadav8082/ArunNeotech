package Java8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.*;

class Student1
{

	public static void main(String[] args) throws IOException {
		
		InputStream obj = new FileInputStream("xobin.java");
		
		System.out.println(obj.available());
	}

}

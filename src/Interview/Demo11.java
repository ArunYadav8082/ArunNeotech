package Interview;

public class Demo11 {
	
	int i;
	Demo11(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) {
		
	
Demo11 s1=new Demo11(10);
Demo11 s2=new Demo11(10);

  System.out.println(s1.equals(s2));
  System.out.println(s1==s2);
	}

}

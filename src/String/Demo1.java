package String;

public class Demo1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Abcdefghijklmnop");
		sb.insert(2,"hay" );
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(150);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
	}

}

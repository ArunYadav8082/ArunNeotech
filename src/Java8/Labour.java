package Java8;

public class Labour
{
	String name;
	int lno;
	
	public Labour(String name, int lno) {
		super();
		this.name = name;
		this.lno = lno;
	}

	/*@Override
	public String toString() {
		return "Labour [name=" + name + ", lno=" + lno + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}*/
}
	class Demo1
	{
		public static void main(String[]args)
		{
			Labour l = new Labour("Arun",100);
			System.out.println(l);
			
		}
	}
	



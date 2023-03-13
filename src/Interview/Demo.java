package Interview;

final public class Demo 
{
	private int i;
	
	Demo(int i)
	{
		this.i = i;
	}
	
	public Demo modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return (new Demo(i));
		}
	}
	
	public static void main(String[] args)
	{
		Demo d1 = new Demo(100);
		
		Demo d2 =  d1.modify(1000);
		Demo d3 = d1.modify(100);
		
		System.out.println(d1==d2);
		System.out.println(d1==d3);
	}

}

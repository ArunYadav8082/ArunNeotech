package Interview;

public class ChandiInt implements InterviewA,InterviewB

	
{

	@Override
	public void m1() {
		System.out.println("Hello ChandiG");
		InterviewA.super.m1();
		//InterviewB.super.m1();
	}
	
	public static void main(String[] args) {
		
		 ChandiInt ct = new  ChandiInt();
		 ct.m1();
		
	}
	
	



}

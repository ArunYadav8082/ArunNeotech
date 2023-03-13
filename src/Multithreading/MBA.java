package Multithreading;

class BookTheaterSeat 
{
	int total_seats=10;
	synchronized void bookSeat(int seats)
	{
		if(total_seats>=seats)
		{
		System.out.println(seats+" :"+"Seats Booked Successfully");
		total_seats = total_seats-seats;
		System.out.println("Seats Lefts"+":"+total_seats);
	    }
		else
		{
			System.out.println(seats+":"+"Seats Can not Booked");
			System.out.println("Seats Lefts :"+ total_seats);
		}
		
	}
}

public class MBA extends Thread
{
	static BookTheaterSeat b;
	int seats;
	public void run()
	{
		b.bookSeat(seats);
	}

	public static void main(String[] args)
	{
		b = new BookTheaterSeat();
		MBA arun = new MBA();
		arun.seats = 7;
		arun.start();
		
		MBA abhay = new MBA();
		abhay.seats = 6;
		abhay.start();
		
	}

}

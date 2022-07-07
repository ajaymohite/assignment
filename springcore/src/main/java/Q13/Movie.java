package Q13;

import java.util.Scanner;

public class Movie {
	
	String movieName;
	String timeSlot;
	double ticketPrice;
	int ticketCount;
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public void count()
	{
		
		
		System.out.println("Movie Name : "+movieName);
		System.out.println("Movie timeSlot : "+timeSlot);
		System.out.println("Movie TicketPrice : "+ticketPrice);
		System.out.println("how many people watch the movie");
		Scanner sc=new Scanner(System.in);
		ticketCount=sc.nextInt();
		double totalCollection =ticketPrice*ticketCount;
		System.out.println("Movie total Collection : "+totalCollection);
	}

	
	

}

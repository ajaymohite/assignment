package Q13;

import java.util.Scanner;

public class Account {

	int ticketCount;
	
	Movie movie;

	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
	
	public void count()
	{
		System.out.println("how many people watch the movie");
		Scanner sc=new Scanner(System.in);
		ticketCount=sc.nextInt();
		double totalCollection = movie.ticketPrice*ticketCount;
		System.out.println("Movie Name : "+movie.movieName);
		System.out.println("Movie timeSlot : "+movie.timeSlot);
		System.out.println("Movie TicketPrice : "+movie.ticketPrice);
		System.out.println("Movie total Collection : "+totalCollection);
	}

}

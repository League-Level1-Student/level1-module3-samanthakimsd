package netflix;

public class Netflix {
public static void main(String[] args) {
	
	Movie m = new Movie("Avengers Endgame", 5);
	Movie n = new Movie("Spiderman Far from Home",500000);
	Movie o = new Movie("Captain Marvel",5);
	Movie p = new Movie("Bee Movie",0);
	Movie q = new Movie("Emoji Movie",0);
	
	
	System.out.println(m.getTicketPrice());
	NetflixQueue matt = new NetflixQueue();
	matt.addMovie(o);
	matt.addMovie(m);
	matt.addMovie(q);
	matt.addMovie(p);
	matt.addMovie(n);
	matt.printMovies();
	
	System.out.println("the best movie is " +matt.getBestMovie());
	System.out.println("the best movie is " +matt.getSecondBestMovie());
}
}

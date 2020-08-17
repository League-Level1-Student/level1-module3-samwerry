package _05_netflix;

public class MovieNet {
public static void main(String[] args) {
	
	Movie mov1=new Movie("NachoLibre", 5);
	Movie mov2= new Movie("Shrek", 5);
	Movie mov3= new Movie("Neemo",4);
	Movie mov4=new Movie("Dory",4);
	Movie mov5 =new Movie("Megamind",5);
	mov1.getTicketPrice();
	mov2.getTicketPrice();
	NetflixQueue Queue = new NetflixQueue();
	Queue.addMovie(mov1);
	Queue.addMovie(mov2);
	Queue.addMovie(mov3);
	Queue.addMovie(mov4);
	Queue.addMovie(mov5);
	
	Queue.printMovies();
	Queue.PrintBestMovie();


}
}

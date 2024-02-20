import java.util.Scanner;

public class MovieCollection {

    private Movie[] movies;
    private int count = 0;

    public MovieCollection(){
        this.movies= new Movie[5];
    }
    public void tilføjFilm (Movie movie){
        movies[count] = movie;
        count++;



    }





}

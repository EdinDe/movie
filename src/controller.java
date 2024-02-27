import java.util.ArrayList;

public class controller {

    static MovieCollection instanceMovieCollection = new MovieCollection();


    public controller(){

    }
    public static void addMovie(String name, String director, int year, int lenghtInMinutes, String genre, boolean isInColour){
        instanceMovieCollection.addMovie(name, director, year, lenghtInMinutes, genre, isInColour);

    }
    public ArrayList<String> listOfMovieTitles(){
        return instanceMovieCollection.listOfMovieTitles();

    }
    public MovieCollection getInstanceMovieCollection(){
        return instanceMovieCollection;
    }
    public void getList(){
        instanceMovieCollection.getList();
    }
    public static String showMovieCollection(){
       return instanceMovieCollection.showMovieCollection();
    }

    public ArrayList<Movie> searchMovie (String search){
        return instanceMovieCollection.searchMovieTitle(search);
    }

}

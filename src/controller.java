import java.util.ArrayList;
import java.util.List;

public class controller {

    MovieCollection instanceMovieCollection = new MovieCollection();


    public controller(){

    }
    public void addMovie(String name, String director, int year, int lenghtInMinutes, String genre, boolean isInColour){
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

}

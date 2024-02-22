import java.util.ArrayList;
import java.util.Scanner;

public class MovieCollection {


    private ArrayList <Movie> MovieCollection;

    public MovieCollection() {
        this.MovieCollection = new ArrayList<>();
    }

    public void addMovie(String name, String director, int year, int lenghtInMinutes, String genre, boolean isInColour){
        MovieCollection.add(new Movie(name, director, year, lenghtInMinutes, genre, isInColour));

    }

    public ArrayList<String> listOfMovieTitles(){
        ArrayList<String> localListOfMovieTitles = new ArrayList<>();
        for (int i = 0; i < MovieCollection.size(); i++){
            localListOfMovieTitles.add(MovieCollection.get(i).getName());
        }
        return localListOfMovieTitles;
    }

    public void getList(){
        for (Movie m : MovieCollection){
            System.out.println(m.toString());
        }
    }



}

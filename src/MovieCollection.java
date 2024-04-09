import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MovieCollection {
    private List<Movie> movies;


    private ArrayList<Movie> MovieCollection;


    public MovieCollection() {
        this.MovieCollection = new ArrayList<>();
    }

    public void addMovie(String name, String director, int year, int lenghtInMinutes, String genre, boolean isInColour) {
        MovieCollection.add(new Movie(name, director, year, lenghtInMinutes, genre, isInColour));

    }

    public void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the collection.");
        } else {
            Collections.sort(movies); // Sort movies by name
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }



    public ArrayList<String> listOfMovieTitles() {
        ArrayList<String> localListOfMovieTitles = new ArrayList<>();
        for (int i = 0; i < MovieCollection.size(); i++) {
            localListOfMovieTitles.add(MovieCollection.get(i).getName());
        }
        return localListOfMovieTitles;
    }

    public void getList() {
        for (Movie m : MovieCollection) {
            System.out.println(m.toString());
        }
    }

    public String showMovieCollection() {
        String result = "";
        for (Movie movie : MovieCollection) {
            result += movie.toString() + "\n\n";
        }
        return result;

    }

    public ArrayList<Movie> searchMovieTitle(String name) {
        ArrayList<Movie> searchResult = new ArrayList<>();
        for (Movie mov : MovieCollection) {
            if (mov.getName().toLowerCase().contains(name.toLowerCase())) {
                searchResult.add(mov);
                //break; til at vise film enkeltvis
                }
            }
            return searchResult;
        }






    }


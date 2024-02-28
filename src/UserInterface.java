import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    controller film = new controller();
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {

    }

    public void start() {
        int sentinel = 2;
        int tal = 0;

        controller.addMovie("Batman", "John", 2010, 90, "action", true);
        controller.addMovie("spiderman", "Jens", 2011, 80, "action", true);
        controller.addMovie("superman", "peter", 1999, 120, "action", true);

        System.out.println("\nVelkommen til min filmsamling");

        while (tal != sentinel) {
            System.out.println("\n1. Opret en film");
            System.out.println("2. Afslut");
            System.out.println("3. Vis min filmsamling");
            System.out.println("4. Søg efter en film\n");

            tal = scanner.nextInt();
            scanner.nextLine();

            if (tal == 1) {
                addMovie();
            } else if (tal == 2) {
                System.out.println("\nVi ses\n");
            } else if (tal == 3) {
                System.out.println("\nListe af film:\n");
                System.out.println(controller.showMovieCollection());
            } else if (tal == 4) {
                searchMovie();
            }
        }
    }

    private void addMovie() {
        System.out.println("Enter movie name:");
        String name = scanner.nextLine();

        System.out.println("Enter directors name");
        String director = scanner.nextLine();

        System.out.println("Enter the year the movie was made");
        int year = scanner.nextInt();

        System.out.println("is it in colour");
        boolean isInColour = false;
        String colorOrNot = scanner.next().toLowerCase();
        if (colorOrNot.equals("ja")) {
            isInColour = true;
        }

        System.out.println("Enter how long the movie is in minutes");
        int lengthInMinutes = scanner.nextInt();

        System.out.println("Enter the genre");
        String genre = scanner.next();

        controller.addMovie(name, director, year, lengthInMinutes, genre, isInColour);
        System.out.println("\nFilmen blev tilføjet");
    }

    private void searchMovie() {
        System.out.println("\nSøg efter film");
        String name = scanner.next();

        boolean fundet = false;
        ArrayList<Movie> foundFilms = controller.searchMovie(name);

        for (Movie movie : foundFilms) {
            System.out.println(movie);
            fundet = true;
        }

        if (!fundet) {
            System.out.println("ingen film med det navn fundet");
        }
    }
}

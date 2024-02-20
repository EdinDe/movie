import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MovieCollection yFilm = new MovieCollection();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movie name");
        String name = scanner.nextLine();

        System.out.println("Enter directors name");
        String director = scanner.nextLine();

        System.out.println("Enter the year the movie was made");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter how long the movie is in minutes");
        int lenghtInMinutes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the genre");
        String genre = scanner.nextLine();




        Movie movie = new Movie(name, director, year, lenghtInMinutes,genre);





    }

}
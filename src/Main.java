import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sentinental = 2;
        int tal = 0;

        while (tal != sentinental) {
            System.out.println("Velkommen til min filmsamling");
            System.out.println("1. Opret en film");
            System.out.println("2. Afslut");
            System.out.print("Vælg en handling: ");
            tal = scanner.nextInt();
            scanner.nextLine();

            if (tal == 1) {
                nyFilm(scanner);
            }
            if (tal != 1 && tal != 2) {
                System.out.println("Prøv igen");
                System.out.println();
            }
        }
        System.out.println("Programmet afsluttet.");
        scanner.close();
    }
        private static void nyFilm(Scanner scanner){

        System.out.println("Enter movie name:");
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

        System.out.println("is it in colour");
        boolean isInColour = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Film oprettet: " + name);

        System.out.println();




    }
}
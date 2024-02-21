public class Movie {

    String name;
    String director;
    private int year;
    private int lenghtInMinutes;
    String genre;
    private boolean isInColour;



    public Movie(String name, String director, int year, int lenghtInMinutes, String genre, boolean isInColour) {
        this.name=name;
        this.director=director;
        this.year=year;
        this.lenghtInMinutes=lenghtInMinutes;
        this.genre=genre;
        this.isInColour=isInColour;

    }

    public String getName(){
        return name;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public int getLenghtInMinutes(){
        return lenghtInMinutes;
    }
    public String getGenre(){
        return genre;
    }

    public boolean isInColour(){
        return isInColour;
    }



}

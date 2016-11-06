package JavaOOP.Lesson6.HomeWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Film {

    private String movieTitle;
    private int yearRelease;
    private Genre genre;
    private List <String> namesActors = new ArrayList<>();

    public Film() {
    }

    public Film(String movieTitle, int yearRelease, Genre genre) {
        this.movieTitle = movieTitle;
        this.yearRelease = yearRelease;
        this.genre = genre;
    }

    public Film addActor(String name){
        namesActors.add(name);
        return this;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<String> getNamesActors() {
        return namesActors;
    }

    @Override
    public String toString() {
        return "Film { " +
                " movie title : '" + movieTitle + '\'' +
                ", year release : " + yearRelease +
                ", genre : " + genre +
                ", names actors : " + namesActors +
                '}';
    }
}

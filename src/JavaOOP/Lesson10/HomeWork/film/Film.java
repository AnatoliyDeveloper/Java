package JavaOOP.Lesson10.HomeWork.film;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Film implements Serializable {

    private static final long serialVersionUID = -1602696609623777709L;

    private String title;
    private int year;
    List<String> actors = new ArrayList<>();
    private Genre genre;

    public Film(String title, int year, Genre genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public Film(String title, int year, String genre) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Film addActor(String name){
        actors.add(name);
        return this;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}

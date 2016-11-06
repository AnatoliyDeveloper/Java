package JavaOOP.Lesson10.HomeWork.film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class FilmUtils {

    public static List<Film> createFilms() {
        List<Film> films = new ArrayList<>();

        films.add(new Film("The Mask", 1994, Genre.COMEDY)
                .addActor("Jim Kerry")
                .addActor("Cameron Dias")
                .addActor("Peter Rigert"));
        films.add(new Film("The Silence of the Lambs", 1991, Genre.HORROR)
                .addActor("Jodie Foster")
                .addActor("Anthony Hopkins")
                .addActor("Scott Glenn"));
        films.add(new Film("City of God", 2002, Genre.CRIME)
                .addActor("Alexandre Rodrigues")
                .addActor("Leandro Firmino da Hora")
                .addActor("Phellipe Haagensen"));
        films.add(new Film("The Sweet Hereafter ", 1997, Genre.DRAMA)
                .addActor("Ian Holm")
                .addActor("Sarah Polley")
                .addActor("Bruce Greenwood"));
        films.add(new Film("The Terminator", 1984, Genre.THRILLER)
                .addActor("Arnold Schwarzenegger")
                .addActor("Michael Biehn")
                .addActor("Linda Hamilton"));

        return films;
    }

    public static List<Film> findFilmByGenre(List<Film> filmList, Genre genre) {
        for (Film film : filmList) {
            if (genre.getGenre().equals(genre)) {
                System.out.println("Genre: " + genre.getGenre() + ", Film: " + film.getTitle());
            }
        }
        return filmList;
    }

    public static List<Film> findFilmByYear(List<Film> filmList, Genre genre, int startYear, int endYear) {
        for (Film film : filmList) {
            if ((film.getYear() >= startYear) && (film.getYear() <= endYear) && film.getGenre().equals(genre)) {
                System.out.println("Genre: " + genre.getGenre() + ", Years: " + startYear + "-" + endYear
                        + ", Film: " + film.getTitle());
            }
        }
        return filmList;
    }
}

package JavaOOP.Lesson6.HomeWork;
/*
1. Найти все фильмы, у которых жанры HORROR, THRILLER.
 2. Найти все фильмы комедии, которые выпущеные в 1990-2000 rr.
 */
import java.util.ArrayList;
import java.util.List;
import static JavaOOP.Lesson6.HomeWork.FilmUtils.*;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class FilmRunner {

    public static void main(String[] args) {

        List<Film> films = createFilms();

        List<Film> horrorFilms = sortGenre(films, Genre.HORROR);
        List<Film> thrillerFilms = sortGenre(films, Genre.THRILLER);
        List<Film> comedyFilms = sortGenre(films, Genre.COMEDY);

        System.out.println("Horror films: " + horrorFilms);
        System.out.println("Thriller films: " + thrillerFilms);
        System.out.println("Comedy films from 1990-2000: " + sortYearRelease(comedyFilms, 1990, 2000));
    }

    private static List<Film> createFilms() {
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
}

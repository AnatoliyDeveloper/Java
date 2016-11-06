package JavaOOP.Lesson6.HomeWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class FilmUtils {

    public static List<Film> sortGenre(List<Film> films, Genre genre) {
        List<Film> result = new ArrayList<>();

        for (Film film : films) {
            if (film.getGenre().equals(genre)) {
                result.add(film);
            }
        }
        return result;
    }


    public static List<Film> sortYearRelease(List<Film> films, int startYear, int endYear) {
        checkYear(startYear, endYear);
        List<Film> res = new ArrayList<>();

        for (Film film : films) {
            if (film.getYearRelease() > startYear && film.getYearRelease() < endYear) {
                res.add(film);
            }
        }
        return res;
    }

    private static void checkYear(int startYear, int endYear) {
        if (startYear >= endYear) {
            throw new IllegalArgumentException();
        }
    }
}

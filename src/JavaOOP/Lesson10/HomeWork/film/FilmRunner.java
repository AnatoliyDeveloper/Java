package JavaOOP.Lesson10.HomeWork.film;

import java.io.IOException;
import java.util.List;
import static JavaOOP.Lesson10.HomeWork.film.FilmIOUtils.*;
/**
 * Created by Anatoliy on 23.10.2016.
 */
public class FilmRunner {

    public static final String INPUT_TEXT_FILE = "files/input_films.csv";
    public static final String OUTPUT_TEXT_FILE = "files/output_films.csv";
    public static final String OUTPUT_BIN_FILE = "files/output_films.dat";

    public static void main(String[] args) {
        try {
            List<Film> films = readFilmsFromFile(INPUT_TEXT_FILE);
            outputFilmsIntoFile(films, OUTPUT_TEXT_FILE);
            outputBinaryFilmIntoFile(films, OUTPUT_BIN_FILE);
            readBinaryFilmFromFile(OUTPUT_BIN_FILE);
            System.out.println("Ready");
        }
        catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        catch (IllegalFormatException e) {
            System.out.println("Illegal format: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

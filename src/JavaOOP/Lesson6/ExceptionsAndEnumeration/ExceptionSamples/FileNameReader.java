package JavaOOP.Lesson6.ExceptionsAndEnumeration.ExceptionSamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class FileNameReader {

    public static void main(String[] args) {
        try {
            String name = readNameFromFile("files/name.txt");
            System.out.println(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String readNameFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        String name = scanner.next();
        scanner.close();

        return name;
    }
}

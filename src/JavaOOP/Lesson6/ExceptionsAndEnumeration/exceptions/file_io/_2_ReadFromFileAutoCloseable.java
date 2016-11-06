package ua.kiev.prog.javaoop.exceptions.file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created on 29.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class _2_ReadFromFileAutoCloseable {
    public static void main(String[] args) {
        // try-with-resources
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("files/hello.txt"))) {
            doTask(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(BufferedReader reader) throws IOException {
        String hello = reader.readLine();
        System.out.println(hello);
    }
}

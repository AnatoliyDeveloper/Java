package ua.kiev.prog.javaoop.exceptions.file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_ReadFromFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("files/hello.txt"));
            doTask(reader);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void doTask(BufferedReader reader) throws IOException {
        String hello = reader.readLine();
        System.out.println(hello);
    }
}

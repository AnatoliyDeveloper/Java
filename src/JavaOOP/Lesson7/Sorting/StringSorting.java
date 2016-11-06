package JavaOOP.Lesson7.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class StringSorting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bob", "Phil");
        Collections.sort(names);
        System.out.println(names);
    }
}

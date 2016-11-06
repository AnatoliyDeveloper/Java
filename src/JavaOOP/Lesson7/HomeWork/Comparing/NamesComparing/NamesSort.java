package JavaOOP.Lesson7.HomeWork.Comparing.NamesComparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class NamesSort {

    public static void main(String[] args) {

        List <String> names = Arrays.asList(
                "John",
                "Bob",
                "Phil",
                "Arnold",
                "Bill"
        );

        alphabeticalOrder(names);
        deskAlphabeticalOrder(names);
        minAlphabeticalOrder(names);
        lengthOrder(names);
        descLengthOrder(names);
    }

    public static void alphabeticalOrder(List<String> names) {
        Collections.sort(names);
        System.out.println("Alphabetical order: " + names);
    }

    public static void deskAlphabeticalOrder(List<String> names) {
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Desk alphabetical order: " + names);
    }

    public static void minAlphabeticalOrder(List<String> names) {
        String shortest = Collections.min(names, new SizeComparator());
        System.out.println("The shortest name is: " + shortest);
        ;
    }

    public static void lengthOrder(List<String> names) {
        Collections.sort(names, new LengthComparator());
        System.out.println("Length order: " + names);
    }

    public static void descLengthOrder(List<String> names) {

        Collections.sort(names,new GroupsDescComparator());
        System.out.println("Desk length order: " + names);
    }
}

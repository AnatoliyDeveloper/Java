package ua.kiev.prog.javaoop.list_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class ForEachSamples {
    public static void main(String[] args) {
        badFillIntArraySample();
        badFillPersonsSample();
        changeNameSample();
    }

    private static void changeNameSample() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bohdan"));
        persons.add(new Person("John"));

        for (Person person : persons) {
            person.setName("1");
        }
        System.out.println(persons);
    }

    private static void badFillPersonsSample() {
        Person[] persons = new Person[10];

        for (Person person : persons) {
            person = new Person("Bohdan");
        }
        System.out.println(Arrays.toString(persons));
    }

    private static void badFillIntArraySample() {
        int[] array = new int[10];

        // READ-ONLY
        for (int elem : array) {
            elem = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}

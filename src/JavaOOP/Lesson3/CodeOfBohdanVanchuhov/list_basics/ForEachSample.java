package ua.kiev.prog.javaoop.list_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class ForEachSample {
    public static void main(String[] args) {
        intArrayTest();
        personsListTest();
    }

    private static void personsListTest() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bohdan"));
        persons.add(new Person("John"));

        for (Person person : persons) {
            person.setName("1");
        }

        System.out.println(persons.toString());
    }

    private static void intArrayTest() {
        int[] array = {0, 1, 2};
        System.out.println(Arrays.toString(array));

        // for implementation
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            elem = 100;
        }

        // for-each implementation
        for (int elem : array) {
            elem = 100;
        }

        System.out.println(Arrays.toString(array));
    }
}

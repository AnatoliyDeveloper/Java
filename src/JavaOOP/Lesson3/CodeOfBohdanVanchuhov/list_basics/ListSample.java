package ua.kiev.prog.javaoop.list_basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class ListSample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bohdan"));
        persons.add(new Person("John"));

        for (Person person : persons) {
            person.sayHello();
        }
    }
}

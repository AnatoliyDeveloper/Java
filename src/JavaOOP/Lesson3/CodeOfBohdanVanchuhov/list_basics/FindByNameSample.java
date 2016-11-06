package ua.kiev.prog.javaoop.list_basics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class FindByNameSample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John"));
        persons.add(new Person("Bohdan"));

        Person person = findByName(persons, "Bohdan");
        System.out.println(person);
    }

    private static Person findByName(List<Person> persons, String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}

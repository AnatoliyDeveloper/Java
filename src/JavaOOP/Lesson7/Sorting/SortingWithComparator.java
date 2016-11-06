package JavaOOP.Lesson7.Sorting;

import JavaOOP.Lesson3.Person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class SortingWithComparator {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );
        Collections.sort(persons, new AgeComparator());
        System.out.println(persons);

        Collections.sort(persons, Collections.reverseOrder(new AgeComparator()));
        System.out.println(persons);
    }
}

class AgeComparator implements Comparator<Person>
{
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}

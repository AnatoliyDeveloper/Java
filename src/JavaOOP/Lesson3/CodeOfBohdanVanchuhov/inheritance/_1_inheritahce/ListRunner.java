package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce;

import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person.Employee;
import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person.Person;
import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class ListRunner {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Smith"));
        persons.add(new Employee("Richard", "Brendon"));
        persons.add(new Student("Fill", "Green"));

        printHello(persons);

        Person person = persons.get(2);
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println(student.sayAboutStudying());
        }
    }

    private static void printHello(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.sayHello());
        }
    }
}

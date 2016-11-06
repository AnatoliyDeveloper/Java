package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce;

import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person.*;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class PolymorphismRunner {
    public static void main(String[] args) {
        Person person = new Student("John", "Smith");

        printHello(person);
    }

    private static void printHello(Person person) {
        System.out.println(person.sayHello());
    }
}

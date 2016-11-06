package ua.kiev.prog.javaoop.encapsulation._1_without_encapsulation;

/**
 * @author Bohdan Vanchuhov
 */
public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;

        printPersonInfo(person);
    }

    private static void printPersonInfo(Person person) {
        System.out.println("Hello, I'm " +
                person.name + ", " + person.age + " years old");
    }
}

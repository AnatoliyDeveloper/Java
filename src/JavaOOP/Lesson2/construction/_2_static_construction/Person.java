package ua.kiev.prog.javaoop.construction._2_static_construction;

/**
 * Created on 27.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Person {
    public static final int DEFAULT_AGE = 0;
    public static final String DEFAULT_NAME = "";

    private String name;
    private String surname;
    private int age;

    public static Person createByName(String name) {
        return new Person(name, DEFAULT_NAME);
    }

    public static Person createBySurname(String surname) {
        return new Person(DEFAULT_NAME, surname, 0);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this(name, surname, DEFAULT_AGE);
    }

//    public Person(String name) {
//        this(name, DEFAULT_NAME);
//    }
//
//    public Person(String surname) {
//        this(DEFAULT_NAME, surname);
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    //----- Getters and Setters -----
}

class PersonRunner {
    public static void main(String[] args) {
        Person bohdan = Person.createByName("Bohdan");
        System.out.println(bohdan);
    }
}

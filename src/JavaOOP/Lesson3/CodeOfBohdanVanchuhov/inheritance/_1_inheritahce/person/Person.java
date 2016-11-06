package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person;

import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.Util;

import java.util.Date;

/**
 * @author Bohdan Vanchuhov
 */
public class Person {
    protected String name;
    protected String surname;
    protected Date birthDate;

    public Person() {
    }

    public Person(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = Util.cloneDate(birthDate);
    }

    public Person(String name, String surname) {
        this(name, surname, null);
    }

    public String sayHello() {
        return "Hello, I'm person";
    }

    //---- Getters and Setters -----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return Util.cloneDate(birthDate);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = Util.cloneDate(birthDate);
    }
}

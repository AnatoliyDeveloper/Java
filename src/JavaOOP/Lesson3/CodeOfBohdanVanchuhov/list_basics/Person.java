package ua.kiev.prog.javaoop.list_basics;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

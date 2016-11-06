package ua.kiev.prog.javaoop.polymorphism._3_static_overriding;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class StaticOverridingSample {
    public static void main(String[] args) {
        Parent x = null;
        x.doSomething(); // BAD CODE
    }
}

class Parent {
    public static void doSomething() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public static void doSomething() {
        System.out.println("Child");
    }
}
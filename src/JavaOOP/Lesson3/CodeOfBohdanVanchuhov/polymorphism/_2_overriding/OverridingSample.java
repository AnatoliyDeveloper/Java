package ua.kiev.prog.javaoop.polymorphism._2_overriding;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class OverridingSample {
    public static void main(String[] args) {
        Doable x = new A();
        x.doSomething();

        x = new B();
        x.doSomething();

        A x1 = (A) x;
    }
}

interface Doable {
    void doSomething();
}

class A implements Doable {
    @Override
    public void doSomething() {
        System.out.println("A");
    }
}

class B implements Doable {
    @Override
    public void doSomething() {
        System.out.println("B");
    }
}
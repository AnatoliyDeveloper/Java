package ua.kiev.prog.javaoop.polymorphism._4_private_method;

/**
 * @author Bohdan Vanchuhov
 */
public class Parent {
    private void whoAreYou() {
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.whoAreYou();
    }
}

class Child extends Parent {
    public void whoAreYou() {
        System.out.println("Child");
    }
}

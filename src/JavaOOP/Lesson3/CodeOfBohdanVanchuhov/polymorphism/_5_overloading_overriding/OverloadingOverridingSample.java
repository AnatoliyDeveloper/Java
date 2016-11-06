package ua.kiev.prog.javaoop.polymorphism._5_overloading_overriding;

/**
 * @author Bohdan Vanchuhov
 */
public class OverloadingOverridingSample {
    public static void main(String[] args) {
        I i = new A();
        i.a(new Double(12d));
    }
}

interface I {
    void a(Number n);
}

class A implements I {
    public void a(Number n) {
        System.out.println("Number");
    }

    public void a(Double d) {
        System.out.println("Double");
    }
}

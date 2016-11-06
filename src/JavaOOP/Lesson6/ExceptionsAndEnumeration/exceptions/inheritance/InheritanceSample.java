package ua.kiev.prog.javaoop.exceptions.inheritance;

/**
 * @author Bohdan Vanchuhov
 */
public class InheritanceSample {
    public static void main(String[] args) {
        useA(new B());
    }

    private static void useA(A a) {
        try {
            a.m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A {
    public void m() throws Exception {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void m() {
        throw new IllegalArgumentException();
    }
}

package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._5_field_hiding;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class FieldHidingSample {
    public static void main(String[] args) {
        B b = new B(10);
    }
}

class A {
    public int x;

    public A(int x) {
        this.x = x;
    }
}

class B extends A {
    public int x;

    public B(int x) {
        super(x);
    }
}

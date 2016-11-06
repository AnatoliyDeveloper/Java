package ua.kiev.prog.javaoop.construction._5_general_case;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class A {
    public static int staticX = initStaticX();

    private static int initStaticX() {
        System.out.println("INIT STATIC X");
        return 10;
    }

    private int x = initX();

    private int initX() {
        System.out.println("Init x");
        return 10;
    }

    static {
        System.out.println("STATIC BLOCK");
    }

    {
        System.out.println("Init block");
    }

    public A() {
        System.out.println("Constructor A()");
    }

    public A(int x) {
        this();
        System.out.println("Constructor A(int)");
    }
}

class ARunner {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        System.out.println(A.staticX);
        System.out.println();

        new A(1);
        System.out.println();

        new A(1);
    }
}

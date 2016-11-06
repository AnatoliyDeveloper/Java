package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._4_initialization;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class InitializationRunner {
    public static void main(String[] args) {
        new Child();
        System.out.println();

        new Child();
        System.out.println();

        new Child();
    }
}

class Parent {
    private static int staticX = initStaticX();

    private static int initStaticX() {
        System.out.println("Parent: INIT STATIC X");
        return 0;
    }

    private int x = initX();

    private int initX() {
        System.out.println("Parent: Init y");
        return 0;
    }

    {
        System.out.println("Parent: Init block");
    }

    static {
        System.out.println("Parent: STATIC BLOCK");
    }

    public Parent() {
        System.out.println("Parent: Constructor()");
    }
}

class Child extends Parent {
    private static int staticY = initStaticY();

    private static int initStaticY() {
        System.out.println("Child: INIT STATIC Y");
        return 0;
    }

    private int y = initY();

    private int initY() {
        System.out.println("Child: Init y");
        return 0;
    }

    static {
        System.out.println("Child: STATIC BLOCK");
    }

    {
        System.out.println("Child: Init block");
    }

    public Child() {
        System.out.println("Child: Constructor()");
    }
}

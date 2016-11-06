package ua.kiev.prog.javaoop.polymorphism._1_overloading;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class OverloadingSample {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));

        HelloSayer helloSayer = new HelloSayer();
        System.out.println(helloSayer.sayHello("Bohdan"));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class HelloSayer {
    public String sayHello() {
        return "Hello";
    }

    public String sayHello(String name) {
        return "Hello, " + name;
    }
}

package Lessons;

/**
 * Created by Anatoliy on 02.09.2016.
 */
public class MyClass {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(r. availableProcessors());
// total amount of memory in the Java virtual machine.
        System.out.println(r. totalMemory());
    }
}


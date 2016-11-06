package ua.kiev.prog.javaoop.enumerations;

/**
 * @author Bohdan Vanchuhov
 */
public class SingletonSample {
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;

        System.out.println(elvis);
    }
}

enum Elvis {
    INSTANCE;

    @Override
    public String toString() {
        return "I'm king";
    }
}

package ua.kiev.prog.javaoop.exceptions.file_io;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_AutoCloseableSample {
    public static void main(String[] args) {
        try (A a = new A()){
            System.out.println("Main Logic");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

class A implements AutoCloseable {
    public A() throws Exception {
        System.out.println("Constructor");
        throw new Exception();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close");
        throw new Exception();
    }
}

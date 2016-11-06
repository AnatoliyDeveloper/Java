package JavaOOP.Lesson3.FullInitialisation;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class FullInitialisation {
    public static int staticX = initStaticX();

    private static int initStaticX() {
        System.out.println("INIT STATIC X");
        return 10;
    }

    private int x = initX();

    private int initX() {
        System.out.println("Init X");
        return 10;
    }

    static {
        System.out.println("STATIC BLOCK");
    }

    {
        System.out.println("Init block");
    }

    public FullInitialisation() {
        System.out.println("Constructor A()");
    }

    public FullInitialisation(int x) {
        this();
        System.out.println("Constructor A(int)");
    }
}

class ARunner {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(FullInitialisation.staticX);
        new FullInitialisation();
    }
}

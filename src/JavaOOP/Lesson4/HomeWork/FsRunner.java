package JavaOOP.Lesson4.HomeWork;

/**
 * Created by Anatoliy on 12.10.2016.
 */
public class FsRunner {
    public static void main(String[] args) {
        Directory root = new Directory()
                .add(new Directory()
                                .add(new File(10))
                                .add(new File(20))
                )
                .add(new Directory()
                                .add(new Directory()
                                                .add(new File(30))
                                )
                )
                .add(new File(40))
                .add(new File(50));

        System.out.println(root);
        System.out.println("size = " + root.getSize());
    }
}

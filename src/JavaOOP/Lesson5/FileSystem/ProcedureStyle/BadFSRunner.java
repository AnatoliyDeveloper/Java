package JavaOOP.Lesson5.FileSystem.ProcedureStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public class BadFSRunner {

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
                .add(new File(50))
                .add(new Symlink(new File(10)));

        System.out.println(root);
        System.out.println("size = " + root.getSize());
    }
}

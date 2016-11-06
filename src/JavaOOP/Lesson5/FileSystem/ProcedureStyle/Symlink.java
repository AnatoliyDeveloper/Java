package JavaOOP.Lesson5.FileSystem.ProcedureStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */

public class Symlink {

    private File file;

    public Symlink() {
    }

    public Symlink(File file) {
        this.file = file;
    }

    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s->" + file;
    }
}

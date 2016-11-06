package JavaOOP.Lesson5.FileSystem.OOPStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public class Symlink extends AbstractFSItem {

    private FSItem item;

    public Symlink(String name, FSItem item) {
        super(name);
        this.item = item;
    }

    public Symlink(FSItem item) {
        this.item = item;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s->" + item;
    }
}

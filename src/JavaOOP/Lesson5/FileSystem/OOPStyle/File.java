package JavaOOP.Lesson5.FileSystem.OOPStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public class File extends AbstractFSItem {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public File(int size) {
        this.size = size;
    }

    public File setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}

package JavaOOP.Lesson4.HomeWork;

/**
 * Created by Anatoliy on 16.10.2016.
 */
public class File extends AbstractFsElements {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                '}';
    }
}

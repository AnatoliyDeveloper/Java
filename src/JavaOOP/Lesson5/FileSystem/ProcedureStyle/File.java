package JavaOOP.Lesson5.FileSystem.ProcedureStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */

public class File {

    private int size;

    public File(int size) {
        FsUtils.notNegative(size, "file");
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        FsUtils.notNegative(size, "file");
        this.size = size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}

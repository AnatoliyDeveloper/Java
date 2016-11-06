package JavaOOP.Lesson5.FileSystem.OOPStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public abstract class AbstractFSItem implements FSItem {

    private String name;

    public AbstractFSItem() {
    }

    public AbstractFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

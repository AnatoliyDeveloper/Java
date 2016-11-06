package JavaOOP.Lesson4.HomeWork;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public abstract class AbstractFsElements implements FsInterface {

    private String name;

    public AbstractFsElements() {
    }

    public AbstractFsElements(String name) {
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

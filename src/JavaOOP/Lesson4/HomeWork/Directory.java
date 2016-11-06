package JavaOOP.Lesson4.HomeWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 12.10.2016.
 */
public class Directory extends AbstractFsElements {

    private List <FsInterface> fsInterfaces = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name) {
        super(name);
    }

    public Directory add(FsInterface fsInterface){
        loopCheck(fsInterface);
        fsInterfaces.add(fsInterface);
        return this;
    }

    @Override
    public int getSize() {
        int sumAllSizes = 0;
        for (FsInterface fsInterface : fsInterfaces){
            sumAllSizes += fsInterface.getSize();
        }
        return sumAllSizes;
    }

    private void loopCheck(FsInterface fsInterface){
        if (creationCircularDependency(fsInterface)){
            throw new IllegalArgumentException("Circular dependency");
        }
    }

    private boolean creationCircularDependency(FsInterface fsInterface){
        fsInterface = this;
        return false;
    }

    @Override
    public String toString() {
        return "Directory{" + fsInterfaces + '}';
    }
}

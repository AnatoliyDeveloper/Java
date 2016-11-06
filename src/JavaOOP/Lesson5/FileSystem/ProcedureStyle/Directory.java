package JavaOOP.Lesson5.FileSystem.ProcedureStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public class Directory {

    private List<File> files = new ArrayList<>();
    private List<Directory> directories = new ArrayList<>();
    private List<Symlink> symlinks = new ArrayList<>();

    public Directory add(File file) {
        FsUtils.notNull(file, "file");

        files.add(file);
        return this;
    }

    public Directory add(Directory directory) {
        FsUtils.notNull(directory, "directory");

        directories.add(directory);
        return this;
    }

    public Directory add(Symlink symlink) {
        FsUtils.notNull(symlink, "symlink");

        symlinks.add(symlink);
        return this;
    }

    public int getSize() {
        int sizeSum = 0;

        for (File file : files) {
            sizeSum += file.getSize();
        }
        for (Directory directory : directories) {
            sizeSum += directory.getSize();
        }
        for (Symlink symlink : symlinks) {
            sizeSum += symlink.getSize();
        }

        return sizeSum;
    }

    @Override
    public String toString() {
        return "d{" + files + ", " + directories + ", " + symlinks + "}";
    }
}

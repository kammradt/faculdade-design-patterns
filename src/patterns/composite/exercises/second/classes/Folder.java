package patterns.composite.exercises.second.classes;

import patterns.composite.exercises.second.interfaces.File;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String fileName, Integer fileSize) {
        super(fileName, fileSize);
        this.files = new ArrayList<File>();
    }

    @Override
    public void info() {
        System.out.printf("I'm a folder! Name: %s and size: %d%n", getFileName(), getFileSize());
        System.out.println("Lets see what I have! " + this.hashCode());
        this.files.forEach(File::info);
        System.out.println("End of folder! " + this.hashCode());
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }


}

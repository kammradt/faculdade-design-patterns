package patterns.composite.exercises.second.classes;

import patterns.composite.exercises.second.interfaces.File;

public class SimpleFile extends File {

    public SimpleFile(String fileName, Integer fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public void info() {
        System.out.printf("I'm a simple file! Name: %s and size: %d%n", getFileName(), getFileSize());
    }
}

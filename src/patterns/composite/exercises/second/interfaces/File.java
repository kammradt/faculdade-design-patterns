package patterns.composite.exercises.second.interfaces;

public abstract class File {
    private String fileName;
    private Integer fileSize;

    public File(String fileName, Integer fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    protected String getFileName() {
        return fileName;
    }

    protected void setFileName(String fileName) {
        this.fileName = fileName;
    }

    protected Integer getFileSize() {
        return fileSize;
    }

    protected void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public abstract void info();
}

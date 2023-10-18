package Entities;

public class Bookmark {
    private int id;
    private int lineNumber;
    private TextFile file;

    public Bookmark(TextFile file, int lineNumber) {
        this.file = file;
        this.lineNumber = lineNumber;
    }

    public int getId() {
        return id;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public TextFile getFile() {
        return file;
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "id=" + id +
                ", lineNumber=" + lineNumber +
                ", file=" + file +
                '}';
    }
}

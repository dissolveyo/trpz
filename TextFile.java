package Entities;

public class TextFile {
    private int id;
    private String fileName;
    private String content;
    private String encoding;

    public TextFile(String fileName, String content, String encoding) {
        this.fileName = fileName;
        this.content = content;
        this.encoding = encoding;
    }

    public int getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", content='" + content + '\'' +
                ", encoding='" + encoding + '\'' +
                '}';
    }
}


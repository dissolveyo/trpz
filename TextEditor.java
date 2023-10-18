package Entities;

import Entities.Bookmark;
import Entities.Hint;
import Entities.Snippet;
import Entities.SyntaxHighlight;

import java.util.List;

public class TextEditor {
    private int id;
    private TextFile currentFile;
    private List<Bookmark> bookmarks;
    private List<Snippet> snippets;
    private List<Hint> hints;
    private SyntaxHighlight syntaxHighlight;

    public void openFile(TextFile file) {
        currentFile = file;
    }

    public TextFile getCurrentFile() {
        return currentFile;
    }

    public void setCurrentFile(TextFile currentFile) {
        this.currentFile = currentFile;
    }

    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public List<Snippet> getSnippets() {
        return snippets;
    }

    public void setSnippets(List<Snippet> snippets) {
        this.snippets = snippets;
    }

    public List<Hint> getHints() {
        return hints;
    }

    public void setHints(List<Hint> hints) {
        this.hints = hints;
    }

    public SyntaxHighlight getSyntaxHighlight() {
        return syntaxHighlight;
    }

    public int getId() {
        return id;
    }

    public void addBookmark(int lineNumber) {
        bookmarks.add(new Bookmark(currentFile, lineNumber));
    }

    public void addSnippet(Snippet snippet) {
        snippets.add(snippet);
    }

    public void addHint(Hint hint) {
        hints.add(hint);
    }

    public void setSyntaxHighlight(SyntaxHighlight syntaxHighlight) {
        this.syntaxHighlight = syntaxHighlight;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "id=" + id +
                ", currentFile=" + currentFile +
                ", bookmarks=" + bookmarks +
                ", snippets=" + snippets +
                ", hints=" + hints +
                ", syntaxHighlight=" + syntaxHighlight +
                '}';
    }
}

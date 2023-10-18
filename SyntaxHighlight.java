package Entities;

public class SyntaxHighlight {
    private int id;
    private String language;
    private String rules;

    public SyntaxHighlight(String language, String rules) {
        this.language = language;
        this.rules = rules;
    }

    public int getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getRules() {
        return rules;
    }

    @Override
    public String toString() {
        return "SyntaxHighlight{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", rules='" + rules + '\'' +
                '}';
    }
}
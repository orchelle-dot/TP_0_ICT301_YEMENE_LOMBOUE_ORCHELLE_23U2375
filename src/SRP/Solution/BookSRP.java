package SRP.Solution;

public class BookSRP {
    private String title;
    private String author;
    private String content;

    public BookSRP(String title, String author, String content) {

        this.title = title;

        this.author = author;

        this.content = content;

    }

// Méthodes pour accéder aux données (getters)

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}

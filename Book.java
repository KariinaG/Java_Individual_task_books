package week12IndividualWork;

public class Book {

    public String title;
    public String author;
    public int pages;
    public String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book(String title, String author, int pages, String description) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.description = description;
    }
}

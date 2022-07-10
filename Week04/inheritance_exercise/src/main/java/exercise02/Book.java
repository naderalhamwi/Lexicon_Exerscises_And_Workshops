package exercise02;

public abstract class Book {
    private String title;
    private String author;
    private String year;
    private int pages;

    public enum category{CHILD, ADULT, NOT_LOANABLE};

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = 100;
    }

    public Book(String title, String author, String year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPages() {

        return pages;
    }

    public void setPages(int pages) {

        this.pages = pages;
    }
}

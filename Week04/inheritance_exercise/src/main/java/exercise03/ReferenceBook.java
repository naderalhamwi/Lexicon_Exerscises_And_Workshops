package exercise03;

public class ReferenceBook extends Book {

    category bookCategory = category.NOT_LOANABLE;

    public ReferenceBook(String title, String author, String year, int pages, category bookCategory) {
        super(title, author, year, pages);
        this.bookCategory = bookCategory;
    }

    public ReferenceBook(String title, String author, String year, category bookCategory) {
        super(title, author, year);
        this.bookCategory = bookCategory;
    }
}
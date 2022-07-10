package exercise02;

public class ReferenceBook extends Book{

    category bookCategory = category.NOT_LOANABLE;

    public ReferenceBook(String title, String author, String year, int pages) {
        super(title, author, year, pages);
    }
}
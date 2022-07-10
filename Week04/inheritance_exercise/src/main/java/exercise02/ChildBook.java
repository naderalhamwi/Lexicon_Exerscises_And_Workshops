package exercise02;


public class ChildBook extends Book implements Loanable{

    category bookCategory = category.CHILD;

    public ChildBook(String title, String author, String year, int pages, category bookCategory) {
        super(title, author, year, pages);
        this.bookCategory = bookCategory;
    }

    public ChildBook(String title, String author, String year, category bookCategory) {
        super(title, author, year);
        this.bookCategory = bookCategory;
    }

    @Override
    public void loan(){
        System.out.println("Child Book");
    }
}
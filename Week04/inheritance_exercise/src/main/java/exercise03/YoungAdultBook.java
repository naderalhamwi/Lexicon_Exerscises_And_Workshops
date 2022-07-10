package exercise03;

public class YoungAdultBook extends Book implements Loanable {

    category bookCategory = category.ADULT;

    public YoungAdultBook(String title, String author, String year, int pages, category bookCategory) {
        super(title, author, year, pages);
        this.bookCategory = bookCategory;
    }

    public YoungAdultBook(String title, String author, String year, category bookCategory) {
        super(title, author, year);
        this.bookCategory = bookCategory;
    }

    @Override
    public void loan(){
        System.out.println("ADULT Book");
    }
}

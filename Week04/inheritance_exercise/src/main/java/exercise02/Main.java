package exercise02;

public class Main {

    public static void main(String[] args) {

        // A book with custom number of pages
        ChildBook book1 = new ChildBook("","","", 12, Book.category.CHILD );
        // A book with default number of pages
        ChildBook book2 = new ChildBook("","","", Book.category.CHILD );

        YoungAdultBook book3 = new YoungAdultBook("","","", 12, Book.category.ADULT );
        YoungAdultBook book4 = new YoungAdultBook("","","", Book.category.ADULT );

    }
}
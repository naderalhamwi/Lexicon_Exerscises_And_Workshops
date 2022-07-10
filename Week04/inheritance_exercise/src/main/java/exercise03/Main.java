package exercise03;

public class Main {

    public static void main(String[] args) {

        ChildBook book1 = new ChildBook("book 1","","", 12, Book.category.CHILD );
        ReferenceBook book2 = new ReferenceBook("book 2","","", 12, Book.category.NOT_LOANABLE );
        YoungAdultBook book3 = new YoungAdultBook("book 3","","", 12, Book.category.ADULT );


        Book[] myBooks = new Book[3];
        myBooks[0] = book1;
        myBooks[1] = book2;
        myBooks[2] = book3;

        /*
        // Iterate through the array and only print out the books that are instanceof the Loanable interface.
        for (int i = 0; i < myBooks.length; i++) {
            System.out.println(myBooks[i] instanceof Loanable);
        }*/

        /*
        // Iterate through the array and only print out the book that is not loanable.
        for (int i = 0; i < myBooks.length; i++) {
            if(myBooks[i] instanceof Loanable == false){
                System.out.println(myBooks[i] + " " +  i);
            }
        }*/


        /*
        // Iterate through the array and only print out the book that has the category CHILD.
        for (int i = 0; i < myBooks.length; i++) {
            System.out.println();
        }*/


        /*
        // Iterate through the array and only print out the book that has the category ADULT.
        for (int i = 0; i < myBooks.length; i++) {
            System.out.println(myBooks[i] instanceof Loanable);
        }*/
    }
}
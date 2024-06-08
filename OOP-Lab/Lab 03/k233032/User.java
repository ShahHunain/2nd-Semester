import java.util.Scanner;

public class User {
    int userId;
    String name;
    int contactInfo;
    int borrowedBooks;

    Scanner myObj = new Scanner(System.in);

    public User(int id, String n, int contactInfo) {
        this.userId=id;
        this.name=n;
        this.contactInfo=contactInfo;
        this.borrowedBooks=0;
    }

    public void borrowBook(Task4Book book, Library library){
        System.out.println("1. Search by title\n2. Search by author");
        int c= myObj.nextInt();
        if(c==1){
            library.searchBookByTitle("Great Expectations");
            book.checkoutBook();
        }
        else if(c==2){
            library.searchBookByAuthor("Charles Dickens");
            book.checkoutBook();
        }
        else{
            System.out.println("Invalid input");
        }
}

    public void returnBook(Task4Book book){
        book.returnBook();
}

}
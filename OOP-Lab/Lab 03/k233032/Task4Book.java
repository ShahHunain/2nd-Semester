
public class Task4Book {
    int bookId;
    String title;
    String author;
    int availability;

    public Task4Book(int id, String n, String a, int avail) {
        this.bookId=id;
        this.title=n;
        this.author=a;
        this.availability=avail;
    }

    public void checkoutBook(){
        if(availability==0){
            System.out.println("Book is not available");
        }
        else{
            System.out.println("Enjoy reading");
            availability=0;
        }
    }

    public void returnBook(){
        if(availability==1){
            System.out.println("You can not return the book");
        }
        else{
            System.out.println("Thank you for returning the book");
            availability=1;
        }
    }
}
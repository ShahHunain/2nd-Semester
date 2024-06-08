public class Book{
        int id;
        String title;
        String author;
        boolean availability;
    
    Book(){
        this.id=0;
        this.title="null";
        this.author="null";
        this.availability=false;
        System.out.println("Default Book Constructor made!");
    }
    
    public Book(int id, String title, String author, boolean availability) {
        this.id=id;
        this.title=title;
        this.author=author;
        this.availability=availability;
        System.out.println("Parameterized Book Constructor made!");
    }
    
    public Book(Book b2){
        this.id=b2.id;
        this.title=b2.title;
        this.author=b2.author;
        this.availability=b2.availability;
        System.out.println("Copy Book Constructor made!");
    }
    
    public void checkoutBook() {
        if(availability){
        availability=false;
        System.out.println("Book checked out: " + title);
        }
        else{
        System.out.println("Book is not available for checkout.");
        }
    }
    
    public void returnBook() {
        if (!availability){
        availability=true;
        System.out.println("Book returned: " + title);
        }
        else{
        System.out.println("Book is already available in the library.");
        }
    }
    
    public void displayBookDetails(){
        System.out.println("\tBook Details:");
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Availability: "+(availability ? "Available" : "Not Available"));   // Learned this in 1st Semester //if true "Available" else "Not available"
    }

    protected void finalize(){
        System.out.println("Book with ID "+id+" is removed from library.");
    }
}

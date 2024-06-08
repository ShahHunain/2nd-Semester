public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String name, double price){
    this.title=title;
    this.author=name;
    this.price=price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    
    public String toString(){
        System.out.println("Book Title: " + getTitle());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Book Price: " + getPrice());
        return  "";
    }
}

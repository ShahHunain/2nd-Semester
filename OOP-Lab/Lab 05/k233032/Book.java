public class Book {
    String title;
    String author;
    String genre;

    Book(){
        this.title="null";
        this.author="null";
        this.genre="null";
    }

    Book(String t, String a, String g){
        this.title=t;
        this.author=a;
        this.genre=g;
    }

    public void getBook(String choice){
            if(this.genre.equals(choice)){
                System.out.println("Title: "+this.title+"\nAuthor: "+this.author+"\n");
            }
            /*else{
                System.out.println("No book with "+choice+" genre found");
            }*/
    
    }
    
}

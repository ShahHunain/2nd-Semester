import java.util.ArrayList;

public class Library {
  String[]  booksAvailable = new String[10];
  int usersRegistered=0;
  ArrayList<User>  userList = new ArrayList<>();
    Library(String a, String b, String c, String d, String  e, String f, String g, String h, String i, String j){
        booksAvailable[0] = a;
        booksAvailable[1] = b;
        booksAvailable[2] = c;
        booksAvailable[3] = d;
        booksAvailable[4] = e;
        booksAvailable[5] = f;
        booksAvailable[6] = g;
        booksAvailable[7] = h;
        booksAvailable[8] = i;
        booksAvailable[9] = j;
    }
    
    public void searchBookByTitle(String title){
    System.out.println(""+title+" is being searched");
    int n=booksAvailable.length;
    for (int i=0; i<n; i++){
        if(booksAvailable[i] != null && booksAvailable[i].equalsIgnoreCase(title)){
            System.out.println("Found and booked!");
            usersRegistered++;
        }
    }
}
    public void searchBookByAuthor(String author){
    System.out.println(""+author+"is being searched");
    int n=booksAvailable.length;
    for (int i=0; i<n; i++) {
        if(booksAvailable[i] != null && booksAvailable[i].equalsIgnoreCase(author)){
        System.out.println("Found and booked!");
        usersRegistered++;
        }
    }
}
public void addUser(User user){
    userList.add(user);
}
public void removeUser(User user){
    userList.remove(user);
}
}

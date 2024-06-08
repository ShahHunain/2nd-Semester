import java.util.ArrayList;

public class RegularUser extends User{

    private static final int maxPosts=5;
    private ArrayList<String> posts;

    RegularUser(){
        super();
        this.posts=new ArrayList<>();
    }

    RegularUser(String userName, String email, String password){
        super(userName,email,password);
        this.posts=new ArrayList<>();
    }

    public void addPost(String post) {
        if (posts.size()<maxPosts) {
            posts.add(post);
            System.out.println("Post added successfully!");
        }
        else{
            System.out.println("Maximum post limit reached!");
        }
    }

    public void viewFeed() {
        System.out.println("Posts by Regular User:");
        for (String post : posts) {
            System.out.println(post);
        }
    }

}
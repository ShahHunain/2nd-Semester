import java.util.ArrayList;
import java.util.Scanner;

public class Post {
    protected String postId;
    protected String content;
    protected int views;
    protected int likes;
    protected ArrayList<String> comments;

    Post(String postId, String content, int views, int likes){
        this.postId = postId;
        this.content = content;
        this.views = views;
        this.likes = likes;
        this.comments = new ArrayList<>();
    }

    Scanner obj = new Scanner(System.in);

    public void addComment(){
        System.out.println("Enter the post ID to which you want to add comment: ");
        String id = obj.nextLine();
        if(id.equals(postId)){
            System.out.println("Write your comment: ");
            String comment = obj.nextLine();
            comments.add(comment);
        }
        else{
            System.out.println("Post ID match not found");
        }
    }

    public void likePost(){
        System.out.println("Enter the post ID you want to like: ");
        String id = obj.nextLine();
        if(id.equals(postId)){
            this.likes++;
        }
        else{
            System.out.println("Post ID match not found");
        }
    }

    public void displayPostDetails(String id){
        if(this.postId.equals(id)){
            System.out.println("Post ID: "+this.postId);
            System.out.println("Content: "+this.content);
            System.out.println("Views: "+this.views);
            System.out.println("Likes: "+this.likes);
            System.out.println("Comments: ");
            if (comments != null) { // Check if comments is not null before iterating
                for(String element: comments){
                    System.out.println(element);
                }
            }
        }
        else{
            System.out.println("Post ID match not found");
        }
    }

}
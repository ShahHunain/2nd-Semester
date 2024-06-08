public class SocialMediaApp{
    public static void main(String[] args){

        System.out.println("\n---------------Shah Hunain (23k-3032)---------------");
        
        RegularUser ru = new RegularUser("Shah Hunain", "shahhunainjee@gmail.com", "passGood");

        BusinessUser bu = new BusinessUser("Ahmed", "ahmedShah@gmail.com", "QWERTYqwerty");
        
        Post p1 = new Post("001", "Friendly", 100, 8);
        Post p2 = new Post("002", "Family", 150, 9);
        Post p3 = new Post("003", "Entertainment", 200, 15);
        
        ru.addPost("Post 1");
        ru.addPost("Post 2");
        ru.addPost("Post 3");

        ru.viewFeed();

        bu.promotePost(p1.content);
        bu.promotePost(p2.content);
        bu.promotePost(p3.content);

        p1.displayPostDetails("001");
        p2.displayPostDetails("002");
        p3.displayPostDetails("003");

    }
}
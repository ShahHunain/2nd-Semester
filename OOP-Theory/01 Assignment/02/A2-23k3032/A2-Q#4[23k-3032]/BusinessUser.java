public class BusinessUser extends User{

    private static final int promotionLimit=10;
    private int promotionCount;

    BusinessUser(){
        super();
        this.promotionCount=0;
    }

    BusinessUser(String userName, String email, String password){
        super(userName,email,password);
        this.promotionCount=0;
    }

    public void promotePost(String post) {
        if (promotionCount<promotionLimit){
            System.out.println("Post \"" + post + "\" has been promoted.");
            promotionCount++;
        }
        else{
            System.out.println("Promotion limit reached!");
        }
    }

}
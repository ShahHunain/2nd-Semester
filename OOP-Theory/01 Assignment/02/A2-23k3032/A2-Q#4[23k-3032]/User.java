import java.util.Scanner;

public class User {
    private String userName;
    private String email;
    private String password;

    User(){
        this.userName="null";
        this.email="null";
        this.password="null";
    }

    User(String userName, String email, String password){
        this.userName=userName;
        this.email=email;
        setPassword(password);
    }

    Scanner obj = new Scanner(System.in);

    public void userVerification(){
        System.out.println("Enter User Name: ");
        String n = obj.nextLine();
        if(n.compareTo(this.userName)==0){
            System.out.println("Enter Email: ");
            String email= obj.nextLine();
            if(email.compareTo(this.email)==0){
                System.out.println("Verification Completed!");
            }
            else{
                System.out.println("Incorrect Email!");
            }
        }
        else{
            System.out.println("Incorrect User Name!");
        }
    }

    public void setPassword(String password){
        this.password=password;
        passwordEncryption();
    }

    public String getPassword(){
        return this.password;
    }

    private void passwordEncryption(){
        this.password="abcd"+this.password+"123";
        System.out.println(this.password);
    }


}
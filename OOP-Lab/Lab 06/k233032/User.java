public class User {
    
    private String name;

    User(){
        this.name="null";
    }

    User(String n){
        this.name=n;
    }

    public String getUsername(){
        return this.name;
    }

    public void manage(){
        System.out.println(""+name+"'s account is being managed");
    }

}

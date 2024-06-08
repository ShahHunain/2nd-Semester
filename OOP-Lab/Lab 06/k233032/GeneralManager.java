public class GeneralManager extends SalesManager {
    
    GeneralManager(String n){
        super(n);
        setRole("General Manager");
    }

    public void overSee(){
        System.out.println(""+getRole()+":  "+getName()+" is overseeing the operations");
    }
}

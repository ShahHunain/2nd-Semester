public class SalesManager extends SalesPerson{
    
    SalesManager(String n){
        super(n);
    }

    public void manage(){
        setRole("Sales Manager");
        System.out.println(""+getRole()+" "+getName()+" is managing the sales team");
    }





    
}

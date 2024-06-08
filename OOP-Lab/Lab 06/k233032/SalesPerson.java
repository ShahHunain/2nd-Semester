public class SalesPerson extends CarDealership{

    SalesPerson(String n){
        super(n,"Sales Person");
    }

    public void closeDeal(){
        System.out.println(""+getRole()+":  "+getName()+" is closing the deal");
    }

}

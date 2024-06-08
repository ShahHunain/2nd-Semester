public class Buyer extends User {
    
    Buyer(String n){
        super(n);
    }

    public void makePurchase(Product product){
        System.out.println(""+getUsername()+" is making purchase of "+product.getName());
    }

}

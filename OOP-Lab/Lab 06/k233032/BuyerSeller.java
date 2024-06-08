public class BuyerSeller extends Buyer{

    BuyerSeller(String n){
        super(n);
    }

    public void makePurchase(Product product, double p){
        System.out.println(""+getUsername()+" is making purchase of "+product.getName()+" of Rs."+p);
    }
}

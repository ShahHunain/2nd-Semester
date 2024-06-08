public class Admin extends User{

    Admin(String n){
        super(n);
    }

    public void makePurchase(Product product){
        System.out.println("Admin("+getUsername()+") is making puchase of "+product.getName());
    }
    
    public void viewSaleProductList(Product product){
        System.out.println("Admin("+getUsername()+") is viewing purchase of "+product.getName());
    }


}

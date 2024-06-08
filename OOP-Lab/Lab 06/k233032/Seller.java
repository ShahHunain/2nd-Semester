public  class Seller extends User {
    
    Seller(String n){
        super(n);
    }

    public void viewSaleProductList(Product product){
        System.out.println(""+getUsername()+" is viewing purchase of "+product.getName());
    }

}

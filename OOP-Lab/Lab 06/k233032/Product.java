public class Product {
    private String name;

    Product(){
        this.name="null";
    }

    Product(String n){
        this.name=n;
    }

    public String getName(){
        return this.name;
    }

}

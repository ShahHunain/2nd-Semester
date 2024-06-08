class Product {
    int id;
    String name;
    double price;
    int quantityAvailable;

    public Product() {
        this.id=0;
        this.name="null";
        this.price=0.0;
        this.quantityAvailable=0;
        System.out.println("Default Product Constructor made!");
    }

    public Product(int id, String name, double price, int quantityAvailable) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantityAvailable=quantityAvailable;
        System.out.println("Parameterized Product Constructor made!");
    }

    public Product(Product p2) {
        this.id=p2.id;
        this.name=p2.name;
        this.price=p2.price;
        this.quantityAvailable=p2.quantityAvailable;
        System.out.println("Copy Product Constructor made!");
    }

    public void updateQuantity(int quantity) {
        this.quantityAvailable=this.quantityAvailable + quantity;
        System.out.println("Quantity updated for product: "+this.name);
    }

    public void displayProductDetails() {
        System.out.println("\tProduct Details:");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity Available: "+quantityAvailable);
    }

    protected void finalize() {
        System.out.println("Product with ID "+id +" is removed from inventory!");
    }
}

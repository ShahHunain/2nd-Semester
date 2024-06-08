class Item {
    String itemId;
    String name;
    static int quantity;
    double price;

    Item(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        Item.quantity=quantity;
        this.price = price;
    }

    void display() {
        System.out.println("\nItem ID: "+itemId);
        System.out.println("Name: "+name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
    }
}

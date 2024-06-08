public class ShoppingCart {
    int items;
    double totalCost;

    public ShoppingCart(int items) {
        this.items = items;
        this.totalCost = 0.0;
    }

    public void calculateTotalCost(Product product, Task5User user) {
        double cost = product.price * user.cart;
        System.out.println("The total cost is: " + cost);
        applyDiscount(user, cost);
    }

    public void applyDiscount(Task5User user, double cost) {
        double discount = 0.10;  // 10%
        double newCost = cost - (cost * discount);
        System.out.println("The total cost after 10% discount is " + newCost);
        confirmOrder(user, cost, newCost);
    }

    public void confirmOrder(Task5User user, double cost, double newCost) {
        System.out.println("Name: " + user.name);
        System.out.println("The shipping address is: " + user.shippingAddress);
        System.out.println("Original Cost: " + cost);
        System.out.println("Discounted Price: " + newCost);
    }
}
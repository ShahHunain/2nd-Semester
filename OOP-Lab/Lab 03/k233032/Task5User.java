public class Task5User {
    int userId;
    String name;
    String shippingAddress;
    int cart;

    public Task5User(int userId, String name, String shippingAddress, int cart) {
        this.userId = userId;
        this.name = name;
        this.shippingAddress = shippingAddress;
        this.cart = cart;
    }

    public void viewCart() {
        System.out.println("The items in the cart are: " + cart);
    }

    public void checkout(Product product) {
        System.out.println("The items in the cart are: " + cart);
    }
}
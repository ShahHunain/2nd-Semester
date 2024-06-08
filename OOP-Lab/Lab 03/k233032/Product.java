import java.util.Scanner;

public class Product {
    int productId;
    String name;
    double price;
    int quantityAvailable;

    public Product(int productId, String name, double price, int quantityAvailable) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    Scanner scanner = new Scanner(System.in);

    public void addToCart(Task5User user) {
        System.out.println("How many " + name + "s do you want to add into cart? ");
        int quantityToAdd = scanner.nextInt();
        if (quantityToAdd <= quantityAvailable) {
            user.cart += quantityToAdd;
            quantityAvailable -= quantityToAdd;
            System.out.println(quantityToAdd + " " + name + "(s) added to cart.");
        } else {
            System.out.println("Not enough " + name + "s available.");
        }
    }

    public void removeFromCart(Task5User user) {
        System.out.println("How many " + name + "s do you want to remove from the cart? ");
        int quantityToRemove = scanner.nextInt();
        if (quantityToRemove <= user.cart) {
            user.cart -= quantityToRemove;
            quantityAvailable += quantityToRemove;
            System.out.println(quantityToRemove + " " + name + "(s) removed from cart.");
        } else {
            System.out.println("Not enough " + name + "s in the cart.");
        }
    }
}
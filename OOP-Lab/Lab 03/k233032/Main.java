//import java.util.Scanner;

public class Main {
    public static void main(String [] args){

                // TASK 1
        /*
        Car c1= new Car(2017, "lambo");

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        */

                //TASK 2
        /*
        Book b1= new Book("Great Expectations","Charles Dickens",79.75);
        b1.toString();
        */

                //TASK 3
        /*
        Flight f = new Flight();
        Passenger p = new Passenger();
        Seat s = new Seat();
        
        p.reserveSeat(f, s);
        */

                //TASK 4
        /*
        Task4Book book1 = new Task4Book(1, "Great Expectations", "Charles Dickens", 1);
        Task4Book book2 = new Task4Book(2, "Treasure Island", "Robert Stevenson", 1);

        User user1 = new User(1, "Ali", 123456);
        User user2 = new User(2, "Ahmed", 987654);

        Library library = new Library("Treasure","Ant","Kidnapped","Prince","Great Expectations","Count","Prisoner","James","Bestcrimes","Heros");

        library.addUser(user1);
        library.addUser(user2);

        user1.borrowBook(book1, library);
        user1.returnBook(book1);
        user2.borrowBook(book2, library);
        user2.returnBook(book2);
        */

                //Task 5
        /*
        Product product = new Product(1, "T-Shirt", 850.50, 5);
        Task5User user = new Task5User(1, "Shah", "Malir, Karachi, Pakistan", 2);
        ShoppingCart cart = new ShoppingCart(2);

        product.addToCart(user);
        user.viewCart();
        user.checkout(product);
        cart.calculateTotalCost(product, user);
        */

                //TASK 6
        /*
        Bank bank = new Bank();
        Customer c1 = new Customer("Shah", "Malir, Karachi, Pakistan");
        Customer c2 = new Customer("Ali", "Lahore, Pakistan");
        
        bank.createAccount(c1, "Savings");
        bank.createAccount(c1, "Current");
        bank.createAccount(c2, "Savings");
        
        Account ShahSavings = c1.getAccounts().get(0);
        Account ShahCurrent = c1.getAccounts().get(1);
        Account AliSavings = c2.getAccounts().get(0);
        
        ShahSavings.deposit(1000);
        ShahSavings.withdraw(500);
        ShahSavings.transfer(ShahCurrent, 200);
        ShahCurrent.transfer(AliSavings, 300);
        
        System.out.println("Shah's Savings Account Balance: " + ShahSavings.getBalance());
        System.out.println("Shah's Current Account Balance: " + ShahCurrent.getBalance());
        System.out.println("Ali's Savings Account Balance: " + AliSavings.getBalance());
        */
        
                //TASK7
        
        Parkinglot p = new Parkinglot(10,4,6);
        Vehicle v = new Vehicle("AB-420","car","10:40","12:20","10ft");
        ParkingSpace ps = new ParkingSpace(14,0,"yes");

        p.parkVehicle(v, ps);
        p.releaseSpace(v, ps);
        }
}

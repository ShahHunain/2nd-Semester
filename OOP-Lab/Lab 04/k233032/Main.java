import java.util.Scanner;

public class Main{
    public static void main(String[] args){

            //TASK 01
    /*
    Scanner myObj = new Scanner(System.in);

    EmployHiring de = new EmployHiring();
    System.out.println("Enter the employ id: ");
    int id = myObj.nextInt();

    myObj.nextLine();
    System.out.println("Enter the employ name: ");
    String name = myObj.nextLine();

    System.out.println("Enter the designation: ");
    String designation = myObj.nextLine();

    System.out.println("Enter the salary: ");
    double salary = myObj.nextDouble();

    EmployHiring pe = new EmployHiring(id, name, designation, salary);
    EmployHiring ce = new EmployHiring(pe);

    EmployDataRetrieval dataRetrival = new EmployDataRetrieval();
    dataRetrival.displayInfo(pe);

    EmployTransfer employTransfer = new EmployTransfer();
    employTransfer.transfer(pe);

    myObj.close();
    */

        //TASK 02
    /*
    Scanner myObj = new Scanner(System.in);
    
    Product p1 = new Product(1, "Laptop", 999.99, 10);
    Product p2 = new Product(p1);

    p1.displayProductDetails();
    p2.displayProductDetails();

    System.out.println("Enter the quantity to update for product 1: ");
    int quantityToUpdate = myObj.nextInt();
    p1.updateQuantity(quantityToUpdate);
    if(quantityToUpdate==0){
        p1.finalize();
        p1=null;
        System.gc();
    }
    myObj.close();
    */

        //TASK 03
    /*
    Scanner myObj = new Scanner(System.in);

    Book b1 = new Book(1, "Great Expectations", "Charles Dickens", true);
    Book b2 = new Book(b1);

    b1.displayBookDetails();
    b2.displayBookDetails();

    System.out.println("Checking out book 1...");
    b1.checkoutBook();

    System.out.println("Returning book 1...");
    b1.returnBook();

    myObj.close();
    b1.finalize();
    b1=null;
    System.gc();
    */

        //TASK04
    /*
    Scanner myObj = new Scanner(System.in);
    
    Vehicle v1 = new Vehicle(1, "SUV", "Toyota", 50.0);
    Vehicle v2 = new Vehicle(v1);

    v1.displayVehicleDetails();
    v2.displayVehicleDetails();

    System.out.println("Vehicle 1:");
    v1.rentVehicle();

    System.out.println("Returning vehicle 1:");
    v1.returnVehicle();
    myObj.close();
    v1.finalize();
    v1=null;
    System.gc();
    */

        //TASK 05

    Scanner myObj = new Scanner(System.in);

    Customer c1 = new Customer("Shah", "Malir,Khi,Pakistan","shah@gmail.com");

    Account a1 = new Account(1,"Savings",5000.0,c1);
    Account a2 = new Account(a1);

    a1.displayAccountInfo();
    a2.displayAccountInfo();
    System.out.println("Depositing 2000 to account 1:");
    a1.deposit(2000.0);

    System.out.println("Withdrawing 1000 from account 1:");
    a1.withdraw(1000.0);
    myObj.close();
    a1.finalize();
    a1=null;
    System.gc();
    }
}
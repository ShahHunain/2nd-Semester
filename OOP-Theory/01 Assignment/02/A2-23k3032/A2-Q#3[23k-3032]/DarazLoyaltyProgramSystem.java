import java.util.Scanner;

public class DarazLoyaltyProgramSystem{
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("\n---------------Shah Hunain (23k-3032)---------------");

        System.out.println("Enter the customer number: ");
        int customerNumber = obj.nextInt();
        obj.nextLine();

        if (customerNumber>0){
            System.out.println("Enter loyalty points: ");
            int loyaltyPoints = obj.nextInt();
            obj.nextLine();
            if (loyaltyPoints>0){
                DarazPersonData dpd = new DarazPersonData();
                dpd.setFirstName("Shah");
                dpd.setLastName("Hunain");
                dpd.setAddress("House No. R#133 Block 'A' Malir 15");
                dpd.setCity("Karachi");
                dpd.setState("Pakistan");
                dpd.setZip("70173");
                dpd.setPhone("0123456789");
                System.out.println("Name: "+dpd.getName());
                System.out.println("Address: "+dpd.getAddress());
                System.out.println("City: "+dpd.getCity());
                System.out.println("State: "+dpd.getState());
                System.out.println("Zip: "+dpd.getZip());
                System.out.println("Phone: "+dpd.getPhone());

                DarazLoyaltyProgram dlp = new DarazLoyaltyProgram(loyaltyPoints);
                dlp.setCustomerNumber(customerNumber);
                System.out.println("Customer Number: " + dlp.getCustomerNumber());
                dlp.addLoyaltyPoints();
                dlp.displayTotalLoyaltyPoints();
                dlp.redeemLoyaltyPoints();

            }
            else{
                System.out.println("Invalid loyalty points");
            }
        }
        else{
            System.out.println("Invalid customer number");
        }
        obj.close();
    }
}
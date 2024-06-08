import java.util.Scanner;

public class BookingManager {

    static Scanner obj = new Scanner(System.in);

    static void cancelBooking(Booking booking){
        System.out.println("Enter Booking Number: ");
        String bn = obj.nextLine();
        
        if(bn.equals(booking.bookingNumber)){
            System.out.println("Enter Flight Number: ");
            String fn = obj.nextLine();
                if(fn.equals(booking.flightNumber)){
                    Booking.bookingStatus=true;
                    System.out.println("Booking with booking number "+booking.bookingNumber+" is cancelled");
                }
                else{
                    System.out.println("Invalid Flight Number");
                }
        }
        else{
            System.out.println("Invalid Booking Number");
        }

    }
    
}

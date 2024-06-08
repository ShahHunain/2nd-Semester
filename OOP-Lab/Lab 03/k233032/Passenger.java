import java.util.Scanner;

class Passenger {
    int passengerId;
    String name;
    String contactInfo;

    public void reserveSeat(Flight flight, Seat seat) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter the passenger ID: ");
        passengerId = myObj.nextInt();
        myObj.nextLine(); // Consume newline character
        
        System.out.println("Enter the passenger name: ");
        name = myObj.nextLine();
        
        System.out.println("Enter the passenger Contact Info: ");
        contactInfo = myObj.nextLine();
        
        System.out.println("Reservation complete!");

        cancelReservation(flight);
    }

    public void cancelReservation(Flight flight) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Do you want to cancel reservation? ");
        System.out.println("1 = Yes\n2. No");
        int c = myObj.nextInt();
        
        if (c == 1) {
            System.out.println("Enter the passenger id to cancel reservation: ");
            int p = myObj.nextInt();
            
            if (p == passengerId) {
                System.out.println("Reservation Cancelled!");
            } else {
                System.out.println("No reservation for " + p + " passenger id!");
            }
        }
        else{
            
        }
        
        System.out.println("Do you want to book the flight?\n1 = Yes\n2. No");
        c = myObj.nextInt();
        
        if (c == 1) {
            flight.bookSeat(passengerId, name, contactInfo);
        }
    }
}
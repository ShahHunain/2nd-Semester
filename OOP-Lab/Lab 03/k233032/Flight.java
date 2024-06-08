import java.util.Scanner;

public class Flight {
    String flightNumber;
    String departureDateTime;
    String arrivalDateTime;
    int capacity;
    int bookedSeats;

    Scanner myObj = new Scanner(System.in);

    public void bookSeat(int passengerId, String name, String contactInfo) {
        System.out.println("Do you want to book seat?\n1. Yes\n2. No");
        int c = myObj.nextInt();
        if (c == 1) {
            System.out.println("Enter the passenger id: ");
            int id = myObj.nextInt();
            if (id == passengerId) {
                Seat seat = new Seat();
                if (seat.isAvailable() == 1) {
                    System.out.println("Flight booked");
                } else {
                    System.out.println("Seat not available");
                }
            }
        }
        else{

        }
    }
}

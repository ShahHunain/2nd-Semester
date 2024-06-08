public class Booking {
    String bookingNumber;
    int passengerName;
    String flightNumber;
    String seatnumber;
    static boolean bookingStatus;

    Booking(){
        this.bookingNumber="null";
        this.passengerName=0;
        this.flightNumber="null";
        this.seatnumber="null";
    }

    Booking(String bN, int pN, String fN, String sN, boolean bS){
        this.bookingNumber=bN;
        this.passengerName=pN;
        this.flightNumber=fN;
        this.seatnumber=sN;
        Booking.bookingStatus=false;
    }

    protected void finalize(){
        System.out.println("Object destroyed");
    }

    public void display(){
        System.out.println("Booking Number: "+this.bookingNumber);
        System.out.println("Passenger Number: "+this.passengerName);
        System.out.println("Flight Number: "+this.flightNumber);
        System.out.println("Seat Number: "+this.seatnumber);
        System.out.println("Booking Status: "+Booking.bookingStatus);
        System.out.println();
    }

    static{
        System.out.println("\tWELCOME to Flight Managment System\n");    //Runs only once in the start of the program //Stated by: Sir Minhal Raza
    }
}

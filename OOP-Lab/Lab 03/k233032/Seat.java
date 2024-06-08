class Seat {
    int seatNumber;
    String seatType;
    int isBooked; // if not booked 0, if booked 1

    public Seat() {
        this.seatNumber = 0;
        this.seatType = "null";
        this.isBooked = 1;
    }

    public int isAvailable() {
        if (isBooked == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
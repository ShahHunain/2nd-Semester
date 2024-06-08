public class ParkingSpace {
    int spaceNumber;
    int isOccupied;
    String vehicleParked;

    ParkingSpace(int spaceNumber,int isOccupied,String vehicleParked){
        this.spaceNumber=spaceNumber;
        this.isOccupied=isOccupied;
        this.vehicleParked=vehicleParked;
    }

    public void allocateSpace(Vehicle vehicle){
        System.out.println("Space Number: "+spaceNumber);
    }

}

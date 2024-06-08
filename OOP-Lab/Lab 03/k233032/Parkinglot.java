import java.util.Scanner;

public class Parkinglot {
    int capacity;
    int availableSpaces;
    int occupiedSpaces;

    public Parkinglot(int capacity, int availableSpaces, int occupiedSpaces){
        this.capacity=capacity;
        this.availableSpaces=availableSpaces;
        this.occupiedSpaces=occupiedSpaces;
    }

    Scanner myObj = new Scanner(System.in);

    public void parkVehicle(Vehicle vehicle, ParkingSpace parkingSpace){
        if(availableSpaces!=0){
            System.out.println("Vehicle with number: "+vehicle.vehicleNumber+" parked");
            vehicle.enterParkingLot();
            parkingSpace.isOccupied=0;
            parkingSpace.allocateSpace(vehicle);
        }
        System.out.println("Do you want to release the car?\n1 = Yes\n2 = No");
        int n = myObj.nextInt();
        myObj.nextLine();
        if(n==1){
            releaseSpace(vehicle,parkingSpace);
            vehicle.exitParkingLot();
            parkingSpace.isOccupied=1;
        }
        else if(n==2){
            System.out.println("Not releasing");
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public void releaseSpace(Vehicle vehicle, ParkingSpace parkingSpace){
        System.out.println("Enter vehicle number to release the car:");
        String vehicleNum = myObj.nextLine();
        if (vehicleNum.equals(vehicle.vehicleNumber)) {
            System.out.println("Vehicle released");
            parkingSpace.isOccupied = 1;
            parkingSpace.vehicleParked = "";
        } else {
            System.out.println("Vehicle with number " + vehicleNum + " not found in this space.");
        }
    }
}

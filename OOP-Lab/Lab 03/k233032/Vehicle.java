public class Vehicle {
    String vehicleNumber;
    String vehicleType;
    String entryTime;
    String exitTime;
    String parkingSpace;

    Vehicle(String vehicleNumber,String vehicleType,String entryTime,String exitTime,String parkingSpace){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.entryTime=entryTime;
        this.exitTime=exitTime;
        this.parkingSpace=parkingSpace;
    }

    public void enterParkingLot(){
        System.out.println("Entry time: "+entryTime);
    }

    public void exitParkingLot(){
        System.out.println("Exit time: "+exitTime);
    }

}

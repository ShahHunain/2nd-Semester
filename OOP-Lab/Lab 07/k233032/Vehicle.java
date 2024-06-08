public class Vehicle {

    protected String vehicleName;
    protected int vehicleNumber;
    protected int wheels;
    
    Vehicle(){
        System.out.println("Its a vehicle");
    }

    Vehicle(String vehicleName, int vehicleNumber, int wheels){
        this.vehicleName=vehicleName;
        this.vehicleNumber=vehicleNumber;
        this.wheels=wheels;
    }

    public void accelerate(double speed){
        System.out.println("The speed is: "+speed+" km/hr.");
    }


}

public class FourWheeler extends Vehicle{

    protected boolean powerSteering;
    
    FourWheeler(){

    }

    FourWheeler(String vehicleName, int vehicleNumber, int wheels, boolean powerSteering){
        super(vehicleName, vehicleNumber, wheels);
        this.powerSteering=powerSteering;
    }

    public void display(){
        System.out.println("\nVehicle Name: "+vehicleName);
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Wheels: "+wheels);
        System.out.println(""+(powerSteering? "Available":"Not Available"));

    }

    public void accelerate(double speed){
        System.out.println("The speed is: "+speed+" km/hr.");
    }
}

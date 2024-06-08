public class Vehicle{
    int id;
    String type;
    String brand;
    double rentalRate;
    boolean available;

    public Vehicle() {
        this.id=0;
        this.type="null";
        this.brand="null";
        this.rentalRate=0.0;
        this.available=true;
        System.out.println("Default Vehicle Constructor made!");
    }

    public Vehicle(int id, String type, String brand, double rentalRate) {
        this.id=id;
        this.type=type;
        this.brand=brand;
        this.rentalRate=rentalRate;
        this.available=true;
        System.out.println("Parameterized Vehicle Constructor made!");
    }

    public Vehicle(Vehicle v2) {
        this.id=v2.id;
        this.type=v2.type;
        this.brand=v2.brand;
        this.rentalRate=v2.rentalRate;
        this.available=v2.available;
        System.out.println("Copy Vehicle Constructor made!");
    }

    public void rentVehicle() {
        if (available){
            available=false;
            System.out.println("Vehicle rented");
        }
        else{
            System.out.println("Vehicle not available for rent.");
        }
    }

    public void returnVehicle() {
        if (!available){
            available=true;
            System.out.println("Vehicle returned: "+brand+" "+type);
        }
        else{
            System.out.println("Vehicle is available.");
        }
    }

    public void displayVehicleDetails() {
        System.out.println("\tVehicle Details:");
        System.out.println("ID: "+id);
        System.out.println("Type: "+type);
        System.out.println("Brand: "+brand);
        System.out.println("Rental Rate: "+rentalRate+" per day");
        System.out.println("Availability: "+(available ? "Available" : "Not Available"));
    }

    protected void finalize() {
        System.out.println("Vehicle with ID " +id+" is removed!");
    }
}

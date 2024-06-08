public class Park {
    private String name;
    private int height;
    private int length;
    private int speed;
    private int capacity;
    private int currentNumRiders;
    private boolean rideInProgress;

    Park(){
        this.name="Roller Coaster";
        this.height=500;
        this.length=2000;
        this.speed=0;
        this.capacity=20;
        this.rideInProgress=false;
        this.adjustCapacity();
    }

    Park(String n, int h, int l, int s, int c, int riders, boolean inProgress){
        this.name=n;
        this.height=h;
        this.length=l;
        this.speed=s;
        this.capacity=c;
        this.currentNumRiders=riders;
        this.rideInProgress=inProgress;
        this.adjustCapacity();
    }

    
    private void adjustCapacity(){
        if (capacity>3){
            if(capacity %2 != 0 || capacity % 3 != 0){
                capacity = capacity + 1;
            }
        }
        else{
            System.out.println("Invalid capacity");
        }
    }

    public void setName(String n){
        name=n;
    }
    public void setHeight(int h){
        height=h;
    }
    public void setLength(int l){
        length=l;
    }
    public void setSpeed(int s){
        speed=s;
    }
    public void setCapacity(int c){
        capacity = c;
        adjustCapacity();
    }
    public void setCurrentNumRiders(int r){
        currentNumRiders=r;
    }
    public void setRideInProgress(boolean p){
        rideInProgress=p;
        adjustCapacity();
    }
    public String getName(){
        return name;
    }
    public int getHeight(){
        return height;
    }
    public int getLength(){
        return length;
    }
    public int getSpeed(){
        return speed;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getCurrentNumRiders(){
        return currentNumRiders;
    }
    public boolean isRideInProgress(){
        return rideInProgress;
    }

    public void load(){
        if (!rideInProgress){
            if(currentNumRiders<=capacity){
                System.out.println("Passengers successfully seated");
            }
            else{
                int rem = currentNumRiders - capacity;
                System.out.println("Number of passengers not seated successfully: " + rem);
            }
        }
        else{
            System.out.println("Ride is in progress");
        }
    }

    public void start() {
        if (!rideInProgress) {
            int remainingSeats = capacity - currentNumRiders;
            System.out.println("Seats Remaining: " + remainingSeats);
        }
    }

    public void stop() {
        if (rideInProgress) {
            rideInProgress = false;
            System.out.println("Ride stopped");
        } else {
            System.out.println("Ride is already stopped");
        }
    }

    public void unload() {
        if (!rideInProgress) {
            System.out.println("Passengers unloaded");
        } else {
            System.out.println("Ride is in progress, passengers cannot be unloaded");
        }
    }

    public void accelerate() {
        int lastDigit = speed % 10;
        speed = speed + lastDigit;
        System.out.println("Speed increased to "+speed);
    }

    public void brakes() {
        if (speed != 0) {
            int tempSpeed = speed;
            while (tempSpeed >= 10){
                tempSpeed /= 10;
            }
            speed =speed - tempSpeed;
            System.out.println("Speed decreased to "+speed);
        }
    }
}
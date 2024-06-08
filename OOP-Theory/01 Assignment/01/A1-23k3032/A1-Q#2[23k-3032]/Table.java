public class Table{
    private final int capacity;
    private int occupiedSeats;
    private boolean clean;

    Table() {
    this.capacity=4;
    this.occupiedSeats=0;
    this.clean=true;
    }

    Table(int capacity){
        if(capacity==4 || capacity==8) {
            this.capacity=capacity;
        }
        else if(capacity<6){
            this.capacity=4;
        }
        else{
            this.capacity=8;
        }
        this.occupiedSeats=0;
        this.clean=true;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getOccupiedSeats(){
        return occupiedSeats;
    }

    public int getFreeSeats(){
        return (capacity-occupiedSeats);
    }

    public boolean isClean(){
        return clean;
    }

    public boolean occupy(int size){
        if (clean && size<=capacity){
            occupiedSeats=size;
            clean=false;
            return true;
        }
        return false;
    }

    public void haveLunch() {
        clean=false;
    }

    public void leave() {
        occupiedSeats=0;
    }

    public void cleanTable() {
        if (occupiedSeats==0){
            clean=true;
        }
    }
}
public class Robot {

    protected String direction;
    protected double x;
    protected double y;

    Robot(){

    }

    Robot(String direction, double x, double y){
        this.direction=direction;
        this.x=x;
        this.y=y;
    }

    public void display(){
        System.out.println("\tThe Initial Position");
        System.out.println("Direction: "+this.direction);
        System.out.println("X co-ordinate: "+this.x);
        System.out.println("Y co-ordinate: "+this.y);
    }

}
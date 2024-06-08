public class MovingRobot extends Robot{
    
    MovingRobot(String direction, double x, double y){
        super(direction, x, y);
        super.display();
    }

    public void moveRobot(int n){    //n is the number of steps
        if(direction.equals("N")){
            y+=n;
        }
        else if(direction.equals("S")){
            y-=n;
        }
        else if(direction.equals("E")){
            x+=n;
        }
        else if(direction.equals("W")){
            x-=n;
        }
        else{
            System.out.println("Invalid Direction");
        }
    }

    public void display(){
        System.out.println("\tThe Updated Position");
        System.out.println("Direction: "+direction);
        System.out.println("X co-ordinate: "+x);
        System.out.println("Y co-ordinate: "+y);
    }

}
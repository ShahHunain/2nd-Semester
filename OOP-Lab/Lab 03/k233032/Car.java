public class Car {
    int yearModel;
    String make;
    int speed;

    Car(int yearModel, String make){
        this.yearModel=yearModel;
        this.make=make;
    }

    void accelerate(){
        speed=speed+5;
        System.out.println(speed);
    }
    void brake(){
        speed=speed-5;
        System.out.println(speed);
    }

}

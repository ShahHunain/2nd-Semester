public class Car{
    String carName;
    String carType;

    Car(String carName, String carType){
        this.carName=carName;
        this.carType=carType;
    }

    private String getCarName(){
        return this.carName;
    }


}
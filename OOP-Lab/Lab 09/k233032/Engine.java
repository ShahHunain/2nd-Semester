public class Engine{
    String engineType;

    public void setEngine(Car car){
        if(car.carType.equals("4T")){
            if(car.carName.equals("Mehran")){
                this.engineType="small";
            }
            else{
                this.engineType="large";
            }
        }
        else{
            this.engineType="bigger";
        }
    }

    public String getEngineType(){
        return this.engineType;
    }

    
}

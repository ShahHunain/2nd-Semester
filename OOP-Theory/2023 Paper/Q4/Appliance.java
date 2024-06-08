public class Appliance {

    protected boolean isOn;
    protected String name;

    Appliance(boolean isOn, String name){
        this.isOn=isOn;
        this.name=name;
    }

    public boolean turnOn(){
        return true;
    }
}

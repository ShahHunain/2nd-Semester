public class Light extends Appliance implements WirelessConnection{
    
    protected double brightness;

    Light(boolean isOn, String name, double brightness){
        super(isOn,name);
        this.brightness=brightness;
    }

    public boolean changeBrightness(){

    }

    public boolean turnOn(){
        isOn=true;
        return isOn;
    }

    public void connect(String nameOfNetwork, String password){
        boolean connected=false;
        if(){
            connected=true;
        }
        else{
            connected=false;
            System.out.println("Failed to connect");
        }
    }

    public void disconnect(){

    }

    public boolean isConnected(){
        return;
    }
}

public class CyberSecurityTool {
    
    protected String securityLevel;
    protected double cost;
    protected int noOfDevices;

    CyberSecurityTool(){

    }

    CyberSecurityTool(String securityLevel, double cost, int noOfDevices){
        /*
        if(securityLevel.equals("High") || securityLevel.equals("Low") || securityLevel.equals("Medium")){
            this.securityLevel=securityLevel;
        }
        if(cost>0.0){
            this.cost=cost;
        }
        if(noOfDevices==10){
            this.noOfDevices=noOfDevices;
        }
        */
        this.securityLevel=securityLevel;
        this.cost=cost;
        this.noOfDevices=noOfDevices;
    }

    public void performScan(){
        System.out.println("\t\nA generic security scan");
    }

}
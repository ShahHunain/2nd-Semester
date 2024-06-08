import java.util.ArrayList;
public class FirewallTool extends CyberSecurityTool{

    private ArrayList<Integer> port;
    private ArrayList<String> protocols;

    FirewallTool(){

    }

    FirewallTool(String securityLevel, double cost, int noOfDevices){
        super(securityLevel, cost, noOfDevices);
    }

    public void setProtocolsList(ArrayList<String> protocols){
        this.protocols=protocols;
    }

    public void generatePortLists(ArrayList<Integer> port){
        this.port=port;
    }

    public void performScan(){
        if(super.securityLevel.equals("High")){
            System.out.println("For "+super.securityLevel+" the following protocol list and traffic from port is allowed");

            System.out.println("PROTOCOL:");
            for(String element: protocols){
                System.out.println(element);
            }

            System.out.println("PORT LIST:");
            for(int i: port){
                System.out.println(i);
            }
        }

        if(super.securityLevel.equals("Medium")){
            System.out.println("For "+super.securityLevel+" the following protocol list and traffic from port (with 2 more) is allowed");

            System.out.println("PROTOCOL:");
            for(String element: protocols){
                System.out.println(element);
            }

            port.add(port.get(port.size()-1)+1);
            port.add(port.get(port.size()-1)+1);
            System.out.println("PORT LIST:");
            for(int i: port){
                System.out.println(i);
            }
        }

        if(super.securityLevel.equals("Low")){
            System.out.println("For "+super.securityLevel+" the following protocol list (with 2 more) and traffic from port (with 5 more) is allowed");

            protocols.add("TCP");
            protocols.add("DNS");

            System.out.println("PROTOCOL:");
            for(String element: protocols){
                System.out.println(element);
            }
            

            for(int j=1; j<=5; j++){
                port.add(port.get(port.size()-1)+1);
            }

            System.out.println("PORT LIST:");
            for(int i: port){
                System.out.println(i);
            }
        }
    }

}
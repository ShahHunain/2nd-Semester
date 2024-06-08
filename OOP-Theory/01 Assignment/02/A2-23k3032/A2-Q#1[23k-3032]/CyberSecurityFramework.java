import java.util.ArrayList;
import java.util.Scanner;

public class CyberSecurityFramework{

    public static void main(String[] args) {

        System.out.println("\n---------------Shah Hunain (23k-3032)---------------");
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Security Level: ");
        String securityLevel = obj.nextLine();

    if(securityLevel.equals("High") || securityLevel.equals("Low") || securityLevel.equals("Medium")){

        System.out.println("Enter the number of devices: ");
        int noOfDevices = obj.nextInt();

        if(noOfDevices==10){
            System.out.println("Enter the cost of security tool: ");
            double cost = obj.nextDouble();
            obj.nextLine();

            String n;
            ArrayList<String> protocol = new ArrayList<>();

            System.out.println("Enter the Protocol List: ");
            for(int i=0; i<=5; i++){
                System.out.println("Enter for "+(i+1));
                n=obj.nextLine();
                if(n.equals("HTTPS") || n.equals("FTP") || n.equals("UDP")  || n.equals("ICMP")  || n.equals("SSH")  || n.equals("SNMP")){
                    protocol.add(n);
                }
                else{
                    System.out.println(""+n+" not matched protocol");
                }
            }

            System.out.println("Enter a digit from your ID: ");
            String id =obj.nextLine();
            int d = id.charAt(0) - '0';

            ArrayList<Integer> port = new ArrayList<>();

            System.out.println("\nThe digit is "+d);
            for(int i=1 ; i<=23; i++){
                port.add(d+i);
            }

            FirewallTool f = new FirewallTool(securityLevel, cost, noOfDevices);
                f.setProtocolsList(protocol);
                f.generatePortLists(port);
                f.performScan();

            }
            else{
                System.out.println("No of possible devices exceed from 10");
            }
        }
        else{
            System.out.println("Invalid scurity level");
        }

    }

}
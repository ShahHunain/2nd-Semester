import java.util.Scanner;

public class Counter {
    
    public boolean searchMedicine(Tablet[] t, Capsule[] c, Syrup[] s){
        Scanner obj = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter name of medicine to search for: ");
        String name = obj.nextLine();
        for(int i=0; i<2; i++){
            if(name.compareTo(t[i].getName())==0){
                found=true;
                System.out.println("\tTablet found with name: "+name);
                System.out.println("Printing Details: ");
                t[i].printMedicineDetails();
                updateRevenue(t[i].getRetailPrice());
            }
            if(name.compareTo(c[i].getName())==0){
                found=true;
                System.out.println("\tMatch found");
                System.out.println("Printing Details: ");
                System.out.println("Tablet found with name: "+name);
                c[i].printMedicineDetails();
                updateRevenue(c[i].getRetailPrice());
            }
            if(name.compareTo(s[i].getName())==0){
                found=true;
                System.out.println("\tMatch found");
                System.out.println("Printing Details: ");
                System.out.println("Tablet found with name: "+name);
                s[i].printMedicineDetails();
                updateRevenue(s[i].getRetailPrice());
            }
        }
        if(!found){
            System.out.println("Medicine with name: "+name+" not found");
            return false;
        }
        else{
            return true;
        }
    }

    public void updateRevenue(double price){
        TimesMedico.overallRevenue=TimesMedico.overallRevenue+price;
        System.out.println("The overall revenue is: "+TimesMedico.overallRevenue);
    }

}
import java.util.Scanner;

public class Pharmacist {

    private Counter counter=new Counter();
    
    public boolean searchMedicine(Tablet[] t, Capsule[] c, Syrup[] s){
        Scanner obj = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter formula of medicine to search for: ");
        String formula = obj.nextLine();
        for(int i=0; i<2; i++){
            if(formula.compareTo(t[i].getFormula())==0){
                found=true;
                System.out.println("\tTablet found with formula: "+formula);
                System.out.println("Printing Details: ");
                t[i].printMedicineDetails();
                counter.updateRevenue(t[i].getRetailPrice());
            }
            if(formula.compareTo(c[i].getFormula())==0){
                found=true;
                System.out.println("\tMatch found");
                System.out.println("Printing Details: ");
                System.out.println("Tablet found with formula: "+formula);
                c[i].printMedicineDetails();
                counter.updateRevenue(c[i].getRetailPrice());
            }
            if(formula.compareTo(s[i].getFormula())==0){
                found=true;
                System.out.println("\tMatch found");
                System.out.println("Printing Details: ");
                System.out.println("Tablet found with formula: "+formula);
                s[i].printMedicineDetails();
                counter.updateRevenue(s[i].getRetailPrice());
            }
        }
        if(!found){
            System.out.println("Medicine with formula: "+formula+" not found");
            return false;
        }
        else{
            return true;
        }
    }
}

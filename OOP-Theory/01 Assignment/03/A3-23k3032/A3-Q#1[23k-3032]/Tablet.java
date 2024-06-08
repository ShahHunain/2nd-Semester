public class Tablet extends Medicine{

    double sucroseLevel;
    
    Tablet(String name, String formula, double retailPrice, String manufactureDate, String expirationDate, double sucroseLevel){
        super(name, formula, retailPrice, manufactureDate, expirationDate);
        if(sucroseLevel>=0.0 && sucroseLevel<=1.0){
            this.sucroseLevel=sucroseLevel;
        }
    }

    public void setSucroseLevel(double sucroseLevel){
        if(sucroseLevel>=0.0 && sucroseLevel<=1.0){
            this.sucroseLevel=sucroseLevel;
        }
    }

    public double getSucroseLevel(){
        return this.sucroseLevel;
    }

    public void printMedicineDetails(){
        //Or super.printMedicineDetails
        System.out.println("\t"+getClass()+" details");
        System.out.println("Name: "+getName());
        System.out.println("Formula: "+getFormula());
        System.out.println("Retail Price: "+getRetailPrice());
        System.out.println("Manufacture Date: "+getManufactureDate());
        System.out.println("Expiration Date: "+getExpirationDate());
        System.out.println("Sucrose level: "+this.sucroseLevel);
    }

}
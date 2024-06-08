public class Syrup extends Medicine{
    
    Syrup(String name, String formula, double retailPrice, String manufactureDate, String expirationDate){
        super(name, formula, retailPrice, manufactureDate, expirationDate);
    }

    public void printMedicineDetails(){
        System.out.println("\t"+getClass()+" details");
        System.out.println("Name: "+getName());
        System.out.println("Formula: "+getFormula());
        System.out.println("Retail Price: "+getRetailPrice());
        System.out.println("Manufacture Date: "+getManufactureDate());
        System.out.println("Expiration Date: "+getExpirationDate());
    }

}
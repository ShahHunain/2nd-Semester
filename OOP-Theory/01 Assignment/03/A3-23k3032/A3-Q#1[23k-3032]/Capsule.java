public class Capsule extends Medicine{

    double absorptionPercentage;

    Capsule(String name, String formula, double retailPrice, String manufactureDate, String expirationDate, double absorptionPercentage){
        super(name, formula, retailPrice, manufactureDate, expirationDate);
        if(absorptionPercentage>=1.0 && absorptionPercentage<=100.0){
            this.absorptionPercentage=absorptionPercentage;
        }
    }

    public void setAbsorptionPercentage(double absorptionPercentage){
        if(absorptionPercentage>=1.0 && absorptionPercentage<=100.0){
            this.absorptionPercentage=absorptionPercentage;
        }
    }
    
    public double getAbsorptionPercentage(){
        return this.absorptionPercentage;
    }

    public void printMedicineDetails(){
        System.out.println("\t"+getClass()+" details");
        System.out.println("Name: "+getName());
        System.out.println("Formula: "+getFormula());
        System.out.println("Retail Price: "+getRetailPrice());
        System.out.println("Manufacture Date: "+getManufactureDate());
        System.out.println("Expiration Date: "+getExpirationDate());
        System.out.println("Sucrose level: "+this.absorptionPercentage);
    }

}
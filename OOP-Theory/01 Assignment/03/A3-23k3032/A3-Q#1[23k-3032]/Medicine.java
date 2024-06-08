public class Medicine {
    
    private String name;
    private String formula;
    private double retailPrice;
    private String manufactureDate;
    private String expirationDate;

    Medicine(){
        this.name="null";
        this.formula="null";
        this.retailPrice=0.0;
        this.manufactureDate="null";
        this.expirationDate="null";
    }

    Medicine(String name, String formula, double retailPrice, String manufactureDate, String expirationDate){
        this.name=name;
        this.formula=formula;
        this.retailPrice=retailPrice;
        this.manufactureDate=manufactureDate;
        this.expirationDate=expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void printMedicineDetails(){
        System.out.println("\t"+getClass()+" details");
        System.out.println("Name: "+this.name);
        System.out.println("Formula: "+this.formula);
        System.out.println("Retail Price: "+this.retailPrice);
        System.out.println("Manufacture Date: "+this.manufactureDate);
        System.out.println("Expiration Date: "+this.expirationDate);
    }
    
}

public class Medication {
    
    String name;
    double dosage;

    Medication(){
        this.name="null";
        this.dosage=0.0;
    }

    Medication(String n, double d){
        this.name=n;
        this.dosage=d;
    }

    public String getName(){
        return this.name;
    }

    public double getDosage(){
        return this.dosage;
    }
    public void displayInfo(){
        System.out.println("Name: "+this.name+" \nDosage: "+this.dosage);
    }

}

public class FullTimeEmployee extends Employee {

    private double increment=20;
    
    FullTimeEmployee(){
        System.out.println("I am a full time Employee");
    }

    double incrementedSalary;

    public void incrementSalary(){
        incrementedSalary = salary + salary*(increment/100);
    }

    public double getIncrementedSalary(){
        return incrementedSalary;
    }

}
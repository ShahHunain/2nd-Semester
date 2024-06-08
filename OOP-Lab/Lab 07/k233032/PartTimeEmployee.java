public class PartTimeEmployee extends Employee{
    
    private double increment=5;
    
    PartTimeEmployee(){
        System.out.println("I am a part time Employee");
    }

    double incrementedSalary;

    public void incrementSalary(){
        incrementedSalary = salary + salary*(increment/100);
    }

    public double getIncrementedSalary(){
        return incrementedSalary;
    }

}

import java.util.Scanner;

public class Employee {

    protected String name;
    protected String position;
    protected int numberOfYears;
    protected double salary;
    
    Employee(){
        this.name="null";
        this.position="null";
        this.numberOfYears=0;
        this.salary=30000;
        System.out.println("I am an Employee");
    }

    public void input(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name=obj.nextLine();
        System.out.println("Enter position: ");
        this.position=obj.nextLine();
        System.out.println("Enter number of years: ");
        this.numberOfYears=obj.nextInt();
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Position: "+this.position);
        System.out.println("Number of years: "+this.numberOfYears);
        System.out.println("Salary: "+this.salary);
    }
    
}
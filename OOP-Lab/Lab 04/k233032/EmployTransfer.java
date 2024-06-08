import java.util.Scanner;

public class EmployTransfer{
    Scanner myObj = new Scanner(System.in);

    public void transfer(EmployHiring employHiring) {
        System.out.println("\tEmploy Information:\nID: " + employHiring.id);
        System.out.println("Name: " + employHiring.name);
        System.out.println("Designation: " + employHiring.designation);
        System.out.println("Salary: " + employHiring.salary);
        System.out.println("Do you want transfer\n1: YES\n2: NO");
        int n = myObj.nextInt();
        myObj.nextLine();
        String department;
        if (n == 1) {
            System.out.println("Enter the name of new department: ");
            department = myObj.nextLine();
        } else if (n == 2) {
            System.out.println("You chose not to transfer");
        } else {
            System.out.println("Invalid Input!");
        }
        cancelEmploy(employHiring);
    }

    public void cancelEmploy(EmployHiring employHiring) {
        System.out.println("Enter id to confirm cancellation: ");
        int confirmId = myObj.nextInt();
        if (confirmId == employHiring.id) {
            System.out.println("Employee with ID " + employHiring.id + " cancelled.");
        } else {
            System.out.println("Confirmation failed. ID mismatch.");
        }
        employHiring.destroy();
    }
}
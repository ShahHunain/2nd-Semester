import java.util.Scanner;

public class Accounts {

    protected double balance;

    Accounts(){

    }

    Accounts(double balance){
        this.balance=balance;
    }

    Scanner obj = new Scanner(System.in);

    public void debit(){
        if(balance>0){
            System.out.println("Enter amount to withdraw: ");
            double amount = obj.nextDouble();
            if(amount<=balance){
                System.out.println("\tInitial Balance");
                System.out.println("Balance: "+getBalance());
                balance=balance-amount;
                System.out.println("Available balance: "+getBalance());
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
    }

    public void credit(){
        System.out.println("Enter amount to credit: ");
        double amount = obj.nextDouble();
        if(amount>0){
            System.out.println("\tInitial Balance");
            System.out.println("Balance: "+getBalance());
            balance=balance+amount;
            System.out.println("Available balance: "+getBalance());
        }
    }

    public double getBalance(){
        return balance;
    }

}
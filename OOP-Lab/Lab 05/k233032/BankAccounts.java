import java.util.ArrayList;

public class BankAccounts {
    String accountNumber;
    double balance;
    double transactionLimit = 25000.00;
    double depositLimit = 25000.00;

    ArrayList<String> transaction_History = new ArrayList<>();

    BankAccounts(){
        this.accountNumber="null";
        this.balance=0.0;
    }

    BankAccounts(String n, double b){
        this.accountNumber=n;
        this.balance=b;
    }

    public void deposit(double amount){
        if(amount<=this.balance && amount<depositLimit){
            balance += amount;
            System.out.println("Deposit of Rs: "+amount+" is successful\nNew Balance: "+this.balance);
        }
        else{
            System.out.println("Deposit limit breached");
        }
    }

    public void withDraw(double amount){
        if(amount<=this.balance && amount<transactionLimit){
            balance -= amount;
            System.out.println("Withdraw of Rs: "+amount+" is successful\nNew Balance: "+this.balance);
        }
        else{
            System.out.println("WithDraw limit breached");
        }
    }

    public void getBankAccounts(){
        System.out.println("\nAccount Number: "+this.accountNumber);
    }


}

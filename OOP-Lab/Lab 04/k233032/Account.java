public class Account{
    int id;
    String accountType;
    double balance;
    Customer customer;

    public Account() {
        this.id=0;
        this.accountType="null";
        this.balance=0.0;
        this.customer=null;
        System.out.println("Default Account Constructor made!");
    }

    public Account(int id, String accountType, double balance, Customer customer) {
        this.id=id;
        this.accountType=accountType;
        this.balance=balance;
        this.customer=customer;
        System.out.println("Parameterized Account Constructor made!");
    }

    public Account(Account a2) {
        this.id=a2.id;
        this.accountType =a2.accountType;
        this.balance=a2.balance;
        this.customer=a2.customer;
        System.out.println("Copy Account Constructor made!");
    }

    public void deposit(double amount) {
        if (amount>0){
            balance=balance+amount;
            System.out.println(""+amount+" deposited to account: "+id);
        }
        else{
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount>0 && amount<=balance) {
            balance=balance-amount;
            System.out.println(""+amount+" withdraw from account: "+id);
        }
        else{
            System.out.println("Invalid withdrawal or Insufficient funds");
        }
    }

    public void displayAccountInfo(){
        System.out.println("\tAccount Information:");
        System.out.println("ID: "+id);
        System.out.println("Type: "+accountType);
        System.out.println("Balance: "+balance);
        System.out.println("Customer Name: "+customer.name);
        System.out.println("Customer Address: "+customer.address);
        System.out.println("Customer Email: "+customer.email);
    }

    protected void finalize(){
        System.out.println("Account with ID "+id+" closed.");
    }
}

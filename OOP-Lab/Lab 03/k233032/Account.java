import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Account {
    String accountId;
    String accountType;
    double balance;
    List<String> transactions;

    public Account(String accountType){
        this.accountId = generateAccountId();
        this.accountType = accountType;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance=balance+amount;
        transactions.add("Deposit: "+amount);
    }

    public void withdraw(double amount) {
        if (balance>=amount){
            balance=balance-amount;
            transactions.add("Withdraw: "+amount);
        } else{
            System.out.println("Not possible");
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            destinationAccount.deposit(amount);
            transactions.add("Transfer: " +amount+" to "+destinationAccount.getAccountId());
        } else{
            System.out.println("Insufficient funds for transfer");
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    private String generateAccountId() {
        return UUID.randomUUID().toString();
    }
}
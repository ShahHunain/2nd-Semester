public class SavingAccount extends Accounts{

    protected double timeSpan;

    SavingAccount(){
        super();
    }

    SavingAccount(double balance){
        super(balance);
    }

    public void setTimeSpan(double timeSpan){
        this.timeSpan=timeSpan;
    }

    public double getTimeSpan(){
        return timeSpan;
    }

    double interestRate;
    double interest;

    public void calculateInterest(){
        interestRate=5;
        interest=balance*(interestRate/100)*timeSpan;
        System.out.println("Time span: "+getTimeSpan());
        System.out.println("Interese: "+interest+" with an interest of "+interestRate+" %");
    }

    @Override
    public void credit(){
        balance=balance+interest;
        System.out.println("Updated Balance: "+getBalance());
    }

    @Override
    public double getBalance(){
        return balance;
    }


}
public class DarazCustomerData {
    private static int customerNumberCounter=0;
    private int customerNumber;
    private int loyaltyPoints;

    public DarazCustomerData(){
        this.customerNumber = ++customerNumberCounter;
    }

    public DarazCustomerData(int loyaltyPoints){
        this.customerNumber=++customerNumberCounter;
        this.loyaltyPoints=loyaltyPoints;
    }

    public int getCustomerNumber(){
        return this.customerNumber;
    }

    public void setCustomerNumber(int customerNumber){
        if(customerNumber>0){
            this.customerNumber=customerNumber;
        }
        else{
            System.out.println("Invalid customer number");
        }
    }

    public int getLoyaltyPoints(){
        return this.loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints){
        if(loyaltyPoints>0){
            this.loyaltyPoints = this.loyaltyPoints+loyaltyPoints;
        }
        else{
            System.out.println("Invalid loyalty points");
        }
    }
}
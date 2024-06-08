import java.util.Scanner;

public class DarazLoyaltyProgram extends DarazCustomerData{

    public DarazLoyaltyProgram(){
        super();
    }

    public DarazLoyaltyProgram(int loyaltyPoints){
        super(loyaltyPoints);
    }

    Scanner obj = new Scanner(System.in);

    public void addLoyaltyPoints(){
        System.out.println("\n\t10 points for each purchase");
        System.out.println("Please enter the number of purchases made");
        int n=obj.nextInt();
        if (n>0){
            setLoyaltyPoints(n*10);
        }
        else{
            System.out.println("Invalid number of purchases");
        }
    }

    public void displayTotalLoyaltyPoints(){
        System.out.println("The total loyalty points are: "+super.getLoyaltyPoints());
    }

    public void redeemLoyaltyPoints(){
        int discount=5;
        if (super.getLoyaltyPoints()>0) {
            if (super.getLoyaltyPoints()<10){
                System.out.println("For " + super.getLoyaltyPoints() + " you earned a discount of 5%");
            }
            else if(super.getLoyaltyPoints()>=10 && super.getLoyaltyPoints()<20) {
                discount=10;
                System.out.println("For "+super.getLoyaltyPoints()+" you earned a discount of "+discount+"%");
            }
            else if(super.getLoyaltyPoints()>=20){
                discount=15;
                System.out.println("For "+super.getLoyaltyPoints()+" you earned a discount of "+discount + "%");
            }
        }
    }
}
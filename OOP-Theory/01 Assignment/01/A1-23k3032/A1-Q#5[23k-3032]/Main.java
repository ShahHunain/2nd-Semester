import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        System.out.println("\n23k3032\nShah Hunain\n");

        BOGOCoupon fHc = new BOGOCoupon("FH-BOGO-12345", 5, 100, "FH");
        BOGOCoupon pBc = new BOGOCoupon("PB-BOGO-67890", 3, 150, "PB");
        
        ArrayList<String> fHm = new ArrayList<>();
        fHm.add("Sushi");
        fHm.add("Pad Thai");
        fHm.add("Mango Tango");

        ArrayList<Integer> fHp = new ArrayList<>();
        fHp.add(2500);
        fHp.add(2000);
        fHp.add(1000);

        ArrayList<String> foodHavenCoupons = new ArrayList<>();
        foodHavenCoupons.add("FH-BOGO-12345");
        
        Restaurant foodHaven = new Restaurant("Food Haven", fHm, fHp, foodHavenCoupons);
        
        User user = new User("Ali", 17, "123456789");
        user.accumulateCoupon("FH-BOGO-12345");
        
        foodHaven.displayMenu();
        
        int currentDate = 20; // 20th day of the year
        
        if (user.hasCoupon("FH-BOGO-12345") && fHc.isValid(currentDate, "FH")) {
            System.out.println("Valid coupon for Food Haven!");
        } else {
            System.out.println("Invalid coupon for Food Haven.");
        }
    }
}
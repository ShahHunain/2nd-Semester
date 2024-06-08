import java.util.ArrayList;

public class Restaurant{
    private String restaurantName;
    private ArrayList<String> menuList;
    private ArrayList<Integer> priceList;
    private ArrayList<String> validCouponCodesList;

    Restaurant(String n, ArrayList<String> menuList, ArrayList<Integer> priceList, ArrayList<String> validCouponCodesList) {
        this.restaurantName = n;
        this.menuList = menuList;
        this.priceList = priceList;
        this.validCouponCodesList = validCouponCodesList;
    }

    public void displayMenu() {
        System.out.println("\t" + restaurantName + " welcomes you!");
        System.out.println("\n\tThe MENU is:");
        int n = menuList.size();
        for (int j = 0; j < n; j++) {
            System.out.println(menuList.get(j) + ": Rs" + priceList.get(j));
        }
    }

    public boolean isValidCoupon(String code) {
        return (validCouponCodesList.contains(code));
    }
}
import java.util.ArrayList;

public class User{
    private String name;
    private int age;
    private String mobileNumber;
    private ArrayList<String> couponsList;

    User() {
        this.name = "null";
        this.age = 0;
        this.mobileNumber = "null";
    }
    
    User(String name, int age, String mobileNumber) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.couponsList = new ArrayList<>();
    }

    public void accumulateCoupon(String coupon) {
        couponsList.add(coupon);
    }

    public boolean hasCoupon(String coupon) {
        return (couponsList.contains(coupon));
    }
}
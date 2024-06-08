public class BOGOCoupon{
    private String couponCode;
    private int validFrom;
    private int validUntil;
    private String restaurantCode;

    public BOGOCoupon(String couponCode, int validFrom, int validUntil, String restaurantCode) {
        this.couponCode = couponCode;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.restaurantCode = restaurantCode;
    }

    public boolean isValid(int currentDate, String restaurantCode) {
        return ((currentDate >= validFrom) && (currentDate <= validUntil) && this.restaurantCode.equals(restaurantCode));
    }
}
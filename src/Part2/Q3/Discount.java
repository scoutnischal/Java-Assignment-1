package Part2.Q3;

public class Discount {
    public static final double SERVICE_PREMIUM_DISCOUNT = 0.20;
    public static final double SERVICE_GOLD_DISCOUNT = 0.15;
    public static final double SERVICE_SILVER_DISCOUNT = 0.10;
    public static final double PRODUCT_DISCOUNT_RATE = 0.10;

    // Method to calculate service discount based on membership
    public static double getServiceDiscount(String membership) {
        switch (membership.toLowerCase()) {
            case "premium":
                return SERVICE_PREMIUM_DISCOUNT;
            case "gold":
                return SERVICE_GOLD_DISCOUNT;
            case "silver":
                return SERVICE_SILVER_DISCOUNT;
            default:
                return 0.0;
        }
    }

    // Method to calculate product discount (always 10% for now)
    public static double getProductDiscount() {
        return PRODUCT_DISCOUNT_RATE;
    }
}

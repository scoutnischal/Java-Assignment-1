package Part2.Q3;

public class Visit {
    private Customer customer;
    private double productsCost;
    private double servicesCost;

    // Constructor
    public Visit(Customer customer, double productsCost, double servicesCost) {
        this.customer = customer;
        this.productsCost = productsCost;
        this.servicesCost = servicesCost;
    }

    // Method to calculate total bill
    public double calculateTotalBill() {
        double totalServiceCost = servicesCost * (1 - Discount.getServiceDiscount(customer.getMembership()));
        double totalProductCost = productsCost * (1 - Discount.getProductDiscount());
        return totalServiceCost + totalProductCost;
    }
}


package Part2.Q3;

public class BeautySalonTest {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice", "Premium");
        Customer customer2 = new Customer("Bob", "Gold");
        Customer customer3 = new Customer("Carol", "Silver");
        Customer customer4 = new Customer("David", "Basic");

        // Create visits
        Visit visit1 = new Visit(customer1, 100.0, 200.0); // $100 products, $200 services
        Visit visit2 = new Visit(customer2, 150.0, 300.0); // $150 products, $300 services
        Visit visit3 = new Visit(customer3, 80.0, 150.0);  // $80 products, $150 services
        Visit visit4 = new Visit(customer4, 120.0, 250.0); // $120 products, $250 services

        // Calculate and print total bills
        System.out.println("Total bill for " + customer1.getName() + ": $" + visit1.calculateTotalBill());
        System.out.println("Total bill for " + customer2.getName() + ": $" + visit2.calculateTotalBill());
        System.out.println("Total bill for " + customer3.getName() + ": $" + visit3.calculateTotalBill());
        System.out.println("Total bill for " + customer4.getName() + ": $" + visit4.calculateTotalBill());
    }
}


package Part2.Q2;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() + overdraftLimit >= amount) {
                balance -= amount;
                System.out.printf("Withdrawn %.2f%n", amount);
                return true;
            } else {
                System.out.println("Exceeds overdraft limit.");
                return false;
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Checking Account %s: Balance = %.2f", getAccountNumber(), getBalance());
    }
}



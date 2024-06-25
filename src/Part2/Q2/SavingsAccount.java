package Part2.Q2;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() >= amount) {
                balance -= amount;
                System.out.printf("Withdrawn %.2f%n", amount);
                return true;
            } else {
                System.out.println("Insufficient funds.");
                return false;
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Savings Account %s: Balance = %.2f", getAccountNumber(), getBalance());
    }
}



package Part2.Q2;

public class Account {
    private String accountNumber;
    protected double balance; // Protected access for subclasses
    private double annualInterestRate;

    public Account(String accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
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

    public void applyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double interest = balance * monthlyInterestRate;
        balance += interest;
        System.out.printf("Interest applied: %.2f%n", interest);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}




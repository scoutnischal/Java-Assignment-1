package Part2.Q2;

public class Main {
    public static void main(String[] args) {
        // Creating instances of accounts
        CheckingAccount checking = new CheckingAccount("12345", 1000, 0.02, 500);
        SavingsAccount savings = new SavingsAccount("54321", 2000, 0.015);

        // Depositing and withdrawing from checking account
        checking.deposit(500);
        checking.withdraw(200);
        System.out.println(checking);

        // Depositing and withdrawing from savings account
        savings.deposit(100);
        savings.withdraw(3000); // Should print "Insufficient funds."
        System.out.println(savings);

        // Applying interest to savings account
        savings.applyInterest();
        System.out.println(savings);
    }
}


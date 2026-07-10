import java.util.ArrayList;

public class SimpleBankAccountSystem {
    public static double calculateBalance(ArrayList<Double> transactions) {
        double balance = 0;
        for(double transaction : transactions) {
            balance = balance + transaction;
        }
        return balance;
    }

    public static void main(String[] args) {
        ArrayList<Double> transactions = new ArrayList<>();

        // Deposits (positive) and withdrawals (negative)
        transactions.add(1000.0); // Initial deposit
        transactions.add(-200.0); // Withdrawal
        transactions.add(500.0); // Deposit
        transactions.add(-100.0); // Withdrawal

        double balance = calculateBalance(transactions);

        System.out.println("=== Account Statement==");
        System.out.println("Transaction: " + transactions.size());
        System.out.println("Currunt Balance: " + balance + " Birr");

        if(balance < 0) {
            System.out.println("Warning: Overdrawn!");
        } else {
            System.out.println("Account in good standing 🎢");
        }

    }
}

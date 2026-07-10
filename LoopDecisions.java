public class LoopDecisions {
    public static void main(String[] args){
        System.out.println("=== M-PESA USER CLASSIFIER ===");

    // Let's loop through 10 user account balances
    for(int balance= 0; balance <= 1000; balance += 100) {

        // DECISION TIME: Who gets premium status?
        if (balance >= 500) {
            System.out.println("Balance: " + balance + " Birr | Status: PREMIUM USER ⭐");
        } else if (balance >= 200) {
            System.out.println("Balance: " + balance + " Birr | Status: STANDARD USER 👤");
        } else {
            System.out.println("Balance: " + balance + " Birr | Status: NEEDS DEPOSIT 🧾");
        }
        }
    }
}
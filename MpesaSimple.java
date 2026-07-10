import java.util.ArrayList;

public class MpesaSimple {
    public static void sendMoney(ArrayList<Double> accounts, int from, int to, double amount){
        if(accounts.get(from) >= amount) {
            accounts.set(from,accounts.get(from) - amount);
            accounts.set(to, accounts.get(to) + amount);
            System.out.println("Sent " + amount + " Birr successfully!");
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public static void main(String[] args) {
        ArrayList<Double> accounts = new ArrayList<>();

        accounts.add(1000.0); // Account 0
        accounts.add(500.0); // Account 1

        System.out.println("Before: " + accounts);

        sendMoney(accounts, 0, 1, 300);

        System.out.println("After: " + accounts);
    }
}

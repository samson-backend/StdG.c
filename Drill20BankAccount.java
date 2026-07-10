public class Drill20BankAccount {
    String accountHolder;
    double balance;

    public Drill20BankAccount(String holder, double initialBalance) {
        accountHolder = holder;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance + " Birr");
    }

    public static void main(String[] args) {
        Drill20BankAccount account = new Drill20BankAccount("Samson", 1000);

        account.checkBalance();
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();


    }
}



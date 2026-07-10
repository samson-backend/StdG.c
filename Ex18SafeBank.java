public class Ex18SafeBank {
    // 'private' means NO ONE can touch this cirectly from outside
    private double balance;
    private String owner;

    public Ex18SafeBank(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
    }
    // The only way to add money
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }
    // The ONLY way to see money
    public void checkBalance() {
        System.out.println(owner + " has: " + balance + " Birr ");
    }

    public static void main(String[] args) {
        Ex18SafeBank myAccount = new Ex18SafeBank("Samson", 10000);

        myAccount.checkBalance();
        myAccount.deposit(2000);
        myAccount.checkBalance();
    }
}
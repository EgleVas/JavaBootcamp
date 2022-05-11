public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void transferFrom(BankAccount account, double amount) {
        this.balance += amount;
        account.balance -= amount;
    }

}

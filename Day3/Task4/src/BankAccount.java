public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 5000) {
            this.balance += amount;
        } else {
            System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("There is not enough funds.");
        }
    }

    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void transferFrom(BankAccount account, double amount) {
        if (account.balance >= amount) {
            this.balance += amount;
            account.balance -= amount;
        } else {
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only " + account.balance + " are available.");
        }

    }
}

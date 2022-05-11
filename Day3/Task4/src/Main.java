public class Main {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount();
        BankAccount secondAccount = new BankAccount(100);
        firstAccount.printBalance();
        secondAccount.printBalance();
        System.out.println();

        firstAccount.deposit(150);
        secondAccount.withdraw(50);
        firstAccount.printBalance();
        secondAccount.printBalance();
        System.out.println();

        secondAccount.transferFrom(firstAccount, 15);
        firstAccount.printBalance();
        secondAccount.printBalance();
        System.out.println();

        firstAccount.withdraw(150);
        secondAccount.withdraw(100);
        firstAccount.printBalance();
        secondAccount.printBalance();
        System.out.println();

        firstAccount.transferFrom(secondAccount, 100);
        firstAccount.printBalance();
        secondAccount.printBalance();
        System.out.println();

        firstAccount.deposit(6000);
        secondAccount.deposit(5000);
        firstAccount.printBalance();
        secondAccount.printBalance();
        System.out.println();
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount testBankAccount_1;
    BankAccount testBankAccount_2;

    @Before
    public void setUp(){
        testBankAccount_1 = new BankAccount();
        testBankAccount_2 = new BankAccount(100);
    }

    @Test
    public void deposit() {
        testBankAccount_1.deposit(150);
        testBankAccount_2.deposit(100);
        assertEquals(150, testBankAccount_1.getBalance(),0.00);
        assertEquals(200, testBankAccount_2.getBalance(),0.00);
    }

    @Test
    public void withdraw() {
        testBankAccount_1.withdraw(50);
        testBankAccount_2.withdraw(50);
        assertEquals(-50, testBankAccount_1.getBalance(), 0.00);
        assertEquals(50, testBankAccount_2.getBalance(),0.00);
    }

    @Test
    public void transferFrom() {
        testBankAccount_1.transferFrom(testBankAccount_2, 50);
        assertEquals(50, testBankAccount_1.getBalance(), 0.00);
        assertEquals(50, testBankAccount_2.getBalance(), 0.00);
    }
}
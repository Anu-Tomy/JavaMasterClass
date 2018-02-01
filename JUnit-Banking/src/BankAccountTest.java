
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {
    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Tom", "Will", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.0, balance, 0);
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Tom", "Will", 1000.00,BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.0, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Tom", "Will", 1000.00,BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.0, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Tom", "Will", 1000.00,BankAccount.CHECKING);
        assertTrue("The account is NOT a checking account",account.isChecking());
    }

}
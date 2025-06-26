import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class BankAccountTest {
    private BankAccount account;
    @Before
    public void setUp() {
        account = new BankAccount(100);
        System.out.println("Setup: Created BankAccount with 100 balance.");
    }

    @After
    public void tearDown() {
        account = null;
        System.out.println("Teardown: Account set to null.");
    }

    @Test
    public void testDeposit() {
        int depositAmount = 50;
        account.deposit(depositAmount);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        int withdrawAmount = 40;
        account.withdraw(withdrawAmount);
        assertEquals(60, account.getBalance());
    }
}
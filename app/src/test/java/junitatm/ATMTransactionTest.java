import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATMTransactionTest {
    private Balance balance;
    private Withdraw withdraw;
    private Deposit deposit;
    private Transfer transfer;

    @BeforeEach
    public void setUp() {
        // Initialize the classes to be tested
        balance = new Balance();
        withdraw = new Withdraw();
        deposit = new Deposit();
        transfer = new Transfer();
        
        // Set an initial balance
        ATMTransaction.balance = 10000;  // Set shared balance for all transactions
    }

    @Test
    public void testBalanceCheck() {
        // Test the balance check functionality
        balance.execute();
        assertEquals(10000, ATMTransaction.balance);  // Check if balance is correct
    }

    @Test
    public void testWithdraw() {
        // Test the withdrawal functionality
        withdraw.execute();
        assertEquals(9500, ATMTransaction.balance);  // Check if the balance decreased correctly
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        // Test withdrawal when balance is insufficient
        ATMTransaction.balance = 500;  // Set low balance for this test
        withdraw.execute();
        assertEquals(500, ATMTransaction.balance);  // Balance should remain the same
    }

    @Test
    public void testDeposit() {
        // Test the deposit functionality
        deposit.execute();
        assertEquals(10500, ATMTransaction.balance);  // Check if balance increased correctly
    }

    @Test
    public void testTransfer() {
        // Test the transfer functionality
        transfer.execute();
        assertEquals(9500, ATMTransaction.balance);  // Check if the balance decreased after transfer
    }

    @Test
    public void testTransferInsufficientBalance() {
        // Test transfer when balance is insufficient
        ATMTransaction.balance = 500;  // Set low balance for this test
        transfer.execute();
        assertEquals(500, ATMTransaction.balance);  // Balance should remain the same
    }
}

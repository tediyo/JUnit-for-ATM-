import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ATMTransactionTest {
    private Balance balance;
    private Withdraw withdraw;
    private Deposit deposit;
    private Transfer transfer;

    @Before
    public void setUp() {
        balance = new Balance();  // Initialize balance check
        withdraw = new Withdraw(); // Initialize withdrawal
        deposit = new Deposit();   // Initialize deposit
        transfer = new Transfer(); // Initialize transfer

        // Set initial balance for testing
        balance.balance = 10000;
    }

    @Test
    public void testBalanceCheck() {
        assertEquals(10000, balance.getBalance()); // Check initial balance
    }

    @Test
    public void testDeposit() {
        deposit.balance = 10000; // Set initial balance
        deposit.depositAmount = 2000; // Mock deposit amount
        deposit.deposit(); // Perform deposit

        assertEquals(12000, deposit.getBalance()); // Expected balance after deposit
    }

    @Test
    public void testWithdrawal() {
        withdraw.balance = 10000; // Set initial balance
        withdraw.withdrawAmount = 3000; // Mock withdrawal amount
        withdraw.withdraw(); // Perform withdrawal

        assertEquals(7000, withdraw.getBalance()); // Expected balance after withdrawal
    }

    @Test
    public void testWithdrawalInsufficientFunds() {
        withdraw.balance = 1000; // Set initial balance
        withdraw.withdrawAmount = 5000; // Mock withdrawal amount (exceeds balance)
        withdraw.withdraw(); // Try withdrawal

        assertEquals(1000, withdraw.getBalance()); // Balance should remain unchanged
    }

    @Test
    public void testTransfer() {
        transfer.balance = 10000; // Set initial balance
        transfer.transferAmount = 2000; // Mock transfer amount
        transfer.transfer(); // Perform transfer

        assertEquals(8000, transfer.getBalance()); // Expected balance after transfer
    }

    @Test
    public void testTransferInsufficientFunds() {
        transfer.balance = 1000; // Set initial balance
        transfer.transferAmount = 5000; // Mock transfer amount (exceeds balance)
        transfer.transfer(); // Try transfer

        assertEquals(1000, transfer.getBalance()); // Balance should remain unchanged
    }
}

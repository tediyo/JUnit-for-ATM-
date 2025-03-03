//JUnit Test


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ATMTransactionTest {
    private BALANCE balance;
    private WITHDRAW withdraw;
    private Deposit deposit;
    private Transfer transfer;

    @Before
    public void setUp() {
        balance = new BALANCE();  // Initialize balance check
        withdraw = new WITHDRAW(); // Initialize withdrawal
        deposit = new Deposit();   // Initialize deposit
        transfer = new Transfer(); // Initialize transfer

        // Set initial balance for testing
        balance.balance = 10000;
    }

    @Test
    public void testBalanceCheck() {
        assertEquals(10000, balance.balancee()); // Check initial balance
    }

    @Test
    public void testDeposit() {
        deposit.balance = 10000; // Set initial balance
        deposit.x = 2000; // Mock deposit amount
        deposit.deposit(); // Perform deposit

        assertEquals(12000, deposit.balance); // Expected balance after deposit
    }

    @Test
    public void testWithdrawal() {
        withdraw.balance = 10000; // Set initial balance
        withdraw.withdraw = 3000; // Mock withdrawal amount
        withdraw.withdrawal(); // Perform withdrawal
        withdraw.balancee(); // Update balance

        assertEquals(7000, withdraw.balance); // Expected balance after withdrawal
    }

    @Test
    public void testWithdrawalInsufficientFunds() {
        withdraw.balance = 1000; // Set initial balance
        withdraw.withdraw = 5000; // Mock withdrawal amount (exceeds balance)
        withdraw.withdrawal(); // Try withdrawal
        withdraw.balancee(); // Update balance

        assertEquals(1000, withdraw.balance); // Balance should remain unchanged
    }

    @Test
    public void testTransfer() {
        transfer.balance = 10000; // Set initial balance
        transfer.n = 2000; // Mock transfer amount
        transfer.transferr(); // Perform transfer
        transfer.balancee(); // Update balance

        assertEquals(8000, transfer.balance); // Expected balance after transfer
    }

    @Test
    public void testTransferInsufficientFunds() {
        transfer.balance = 1000; // Set initial balance
        transfer.n = 5000; // Mock transfer amount (exceeds balance)
        transfer.transferr(); // Try transfer
        transfer.balancee(); // Update balance

        assertEquals(1000, transfer.balance); // Balance should remain unchanged
    }
}
// 
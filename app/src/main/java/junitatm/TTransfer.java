package junitatm;

public class TTransfer {
    int balance = ATMTransaction.balance;  // Linking with shared balance in ATMTransaction class
    int transferAmount;

    // Method to perform transfer
    public void transfer() {
        if (transferAmount <= balance) {
            balance -= transferAmount;
            ATMTransaction.balance = balance;  // Updating shared balance
        }
    }

    // Getter method for balance
    public int getBalance() {
        return balance;
    }

    // Method to set the transfer amount
    public void setTransferAmount(int amount) {
        this.transferAmount = amount;
    }
}

package junitatm;

public class BBalance {
    int balance = ATMTransaction.balance;  // Linking with shared balance in ATMTransaction class

    // Getter method for balance
    public int getBalance() {
        return balance;
    }

    // Method to set the balance for testing
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

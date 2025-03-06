package junitatm;

public class WIithdraw {
    int balance = ATMTransaction.balance;  // Linking with shared balance in ATMTransaction class
    int withdrawAmount;

    // Method to perform withdrawal
    public void withdraw() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            ATMTransaction.balance = balance;  // Updating shared balance
        }
    }

    // Getter method for balance
    public int getBalance() {
        return balance;
    }

    // Method to set the withdrawal amount
    public void setWithdrawAmount(int amount) {
        this.withdrawAmount = amount;
    }
}

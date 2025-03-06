package junitatm;

public class DDeposit {
    int balance = ATMTransaction.balance;  // Linking with shared balance in ATMTransaction class
    int depositAmount;

    // Method to perform deposit
    public void deposit() {
        balance += depositAmount;
        ATMTransaction.balance = balance;  // Updating shared balance
    }

    // Getter method for balance
    public int getBalance() {
        return balance;
    }

    // Method to set the deposit amount
    public void setDepositAmount(int amount) {
        this.depositAmount = amount;
    }
}

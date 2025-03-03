public class Deposit {
    int balance;
    int depositAmount;

    // Method to perform deposit
    public void deposit() {
        balance += depositAmount;
    }

    // Getter method for balance
    public int getBalance() {
        return balance;
    }
}

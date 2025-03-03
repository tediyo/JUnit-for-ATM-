public class Withdraw {
    int balance;
    int withdrawAmount;

    // Method to perform withdrawal
    public void withdraw() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        }
    }

    // Getter method for balance
    public int getBalance() {
        return balance;
    }
}

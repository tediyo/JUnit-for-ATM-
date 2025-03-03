public class Transfer {
    int balance;
    int transferAmount;

    // Method to perform transfer
    public void transfer() {
        if (transferAmount <= balance) {
            balance -= transferAmount;
        }
    }

    // Getter method for balance
    public int getBalance() {
        return balance;
    }
}

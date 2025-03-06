// package junitatm;
// import javax.swing.JOptionPane;
// import java.util.InputMismatchException;
// import java.util.Scanner;
// import junitatm.Balance;
// import junitatm.Deposit;
// import junitatm.Transfer;
// import junitatm.Withdraw;
// import junitatm.ATMTransaction;


// // Abstract class for ATM Transactions
// public abstract class ATMTransaction {
//     protected static int balance = 10000; // Shared balance for all transactions

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         JOptionPane.showMessageDialog(null, "WELCOME TO MINI AUTOMATED TELLER MACHINE");
        
//         // PIN Verification: Loops until the correct PIN is entered
//         int pin;
//         do {
//             pin = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER YOUR PIN NUMBER"));
//             if (pin != 1234) {
//                 JOptionPane.showMessageDialog(null, "You have entered a wrong PIN...please try again");
//             }
//         } while (pin != 1234);
        
//         processATM(scanner);
//     }

//     // Handles ATM menu and user choices
//     private static void processATM(Scanner scanner) {
//         int choice;
//         do {
//             String input = JOptionPane.showInputDialog("Choose an option:\n"
//                     + "1 - Withdraw\n"
//                     + "2 - Check Balance\n"
//                     + "3 - Transfer\n"
//                     + "4 - Deposit\n"
//                     + "5 - Exit");
            
//             try {
//                 choice = Integer.parseInt(input);
//                 switch (choice) {
//                     case 1:
//                         new Withdraw().execute();
//                         break;
//                     case 2:
//                         new Balance().execute();
//                         break;
//                     case 3:
//                         new Transfer().execute();
//                         break;
//                     case 4:
//                         new Deposit().execute();
//                         break;
//                     case 5:
//                         JOptionPane.showMessageDialog(null, "Thank you for using CBE ATM!");
//                         System.exit(0);
//                         break;
//                     default:
//                         JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
//                 }
//             } catch (NumberFormatException e) {
//                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
//                 choice = 0;
//             }
//         } while (choice != 5);
//     }
    
//     // Abstract method to be implemented by subclasses
//     public abstract void execute();
// }

// // Class to check account balance
// class Balance extends ATMTransaction {
//     @Override
//     public void execute() {
//         JOptionPane.showMessageDialog(null, "Your current balance is: " + balance + " birr");
//     }
// }

// // Class for withdrawing money
// class Withdraw extends ATMTransaction {
//     @Override
//     public void execute() {
//         try {
//             int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to withdraw:"));
//             if (amount > balance) {
//                 JOptionPane.showMessageDialog(null, "Insufficient balance!");
//             } else {
//                 balance -= amount;
//                 JOptionPane.showMessageDialog(null, "You withdrew " + amount + " birr.\nRemaining balance: " + balance);
//             }
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
//         }
//     }
// }

// // Class for depositing money
// class Deposit extends ATMTransaction {
//     @Override
//     public void execute() {
//         try {
//             int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to deposit:"));
//             balance += amount;
//             JOptionPane.showMessageDialog(null, "You deposited " + amount + " birr.\nNew balance: " + balance);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
//         }
//     }
// }

// // Class for transferring money
// class Transfer extends ATMTransaction {
//     @Override
//     public void execute() {
//         try {
//             int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter recipient account number:"));
//             int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to transfer:"));
            
//             if (amount > balance) {
//                 JOptionPane.showMessageDialog(null, "Insufficient balance!");
//             } else {
//                 balance -= amount;
//                 JOptionPane.showMessageDialog(null, "Successfully transferred " + amount + " birr to account " + accountNumber + ".\nRemaining balance: " + balance);
//             }
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
//         }
//     }
// }
package junitatm;

import javax.swing.JOptionPane;
import java.util.Scanner;

// Abstract class for ATM Transactions
public abstract class ATMTransaction {
    protected static int balance = 10000; // Shared balance for all transactions

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "WELCOMEE TO MINI AUTOMATED TELLER MACHINE");

        // PIN Verification: Loops until the correct PIN is entered
        int pin;
        do {
            try {
                pin = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER YOUR PIN NUMBER"));
                if (pin != 1234) {
                    JOptionPane.showMessageDialog(null, "You have entered a wrong PIN...please try again");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a 4-digit PIN.");
                pin = -1; // Force retry
            }
        } while (pin != 1234);

        processATM(scanner);
    }

    // Handles ATM menu and user choices
    private static void processATM(Scanner scanner) {
        int choice;
        do {
            String input = JOptionPane.showInputDialog("Choose an option:\n"
                    + "1 - Withdraw\n"
                    + "2 - Check Balance\n"
                    + "3 - Transfer\n"
                    + "4 - Deposit\n"
                    + "5 - Exit");

            try {
                choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        new Withdraw().execute();
                        break;
                    case 2:
                        new Balance().execute();
                        break;
                    case 3:
                        new Transfer().execute();
                        break;
                    case 4:
                        new Deposit().execute();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Thank you for using CBE ATM!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                choice = 0;
            }
        } while (choice != 5);
    }

    // Abstract method to be implemented by subclasses
    public abstract void execute();
}

// Class to check account balance
class Balance extends ATMTransaction {
    @Override
    public void execute() {
        JOptionPane.showMessageDialog(null, "Your current balance is: " + balance + " birr");
    }
}

// Class for withdrawing money
class Withdraw extends ATMTransaction {
    @Override
    public void execute() {
        try {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to withdraw:"));

            if (amount <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Please enter a positive value.");
            } else if (amount > balance) {
                JOptionPane.showMessageDialog(null, "Insufficient balance!");
            } else {
                balance -= amount;
                JOptionPane.showMessageDialog(null, "You withdrew " + amount + " birr.\nRemaining balance: " + balance);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
        }
    }
}

// Class for depositing money
class Deposit extends ATMTransaction {
    @Override
    public void execute() {
        try {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to deposit:"));

            if (amount <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Please enter a positive value.");
            } else {
                balance += amount;
                JOptionPane.showMessageDialog(null, "You deposited " + amount + " birr.\nNew balance: " + balance);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
        }
    }
}

// Class for transferring money
class Transfer extends ATMTransaction {
    @Override
    public void execute() {
        try {
            int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter recipient account number:"));
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to transfer:"));

            if (amount <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Please enter a positive value.");
            } else if (amount > balance) {
                JOptionPane.showMessageDialog(null, "Insufficient balance!");
            } else {
                balance -= amount;
                JOptionPane.showMessageDialog(null, "Successfully transferred " + amount + " birr to account " + accountNumber + ".\nRemaining balance: " + balance);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
        }
    }
}

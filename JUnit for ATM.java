
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ATMTransaction {
    public int balance = 10000;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "WELCOME TO CBE AUTOMATED TELLER MACHINE");
        JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR PIN NUMBER");
        int p = s.nextInt();

        if (p == 1234) {
            processATM(s);
        } else {
            JOptionPane.showMessageDialog(null, "You have entered a wrong PIN...please enter the correct PIN");
            p = s.nextInt();
            processATM(s);
        }
    }

    private static void processATM(Scanner s) {
        int n;
        int z;
        do {
            JOptionPane.showMessageDialog(null, "Choose 1 for withdraw\n" +
                    "Choose 2 for check balance\n" +
                    "Choose 3 for transfer\n" +
                    "Choose 4 for deposit\n" +
                    "Choose 5 for exit\n" +
                    "Choose the operation");

            n = s.nextInt();

            switch (n) {
                case 1:
                    WITHDRAW t = new WITHDRAW();
                    t.display();
                    t.withdrawal();
                    t.balancee();
                    break;
                case 2:
                    BALANCE v = new BALANCE();
                    v.display();
                    v.balancee();
                    break;
                case 3:
                    Transfer b = new Transfer();
                    b.display();
                    b.transferr();
                    b.balancee();
                    break;
                case 4:
                    Deposit h = new Deposit();
                    h.display();
                    h.deposit();
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "SORRY ...your choice is wrong");
            }
            JOptionPane.showMessageDialog(null, "To go to Main menu press 0 or 1");
            z = s.nextInt();
        } while (z == 0 || z == 1);
    }

    public abstract String display();
}

class BALANCE extends ATMTransaction implements test {
    public BALANCE() {
        JOptionPane.showMessageDialog(null, "Your account current balance is " + balance);
    }

    public int balancee() {
        return balance;
    }

    @Override
    public String display() {
        JOptionPane.showMessageDialog(null, "WELCOME TO CBE BALANCE CHECKING SYSTEM");
        return null;
    }
}

class WITHDRAW extends ATMTransaction implements test {
    Scanner s = new Scanner(System.in);
    int withdraw = 0;

    public WITHDRAW() {
        JOptionPane.showMessageDialog(null, "Enter the amount you want to withdraw");
        withdraw = s.nextInt();
    }

    public void balancee() {
        if (withdraw > balance) {
            JOptionPane.showMessageDialog(null, "Your current balance is " + balance);
        } else {
            balance = balance - withdraw;
            JOptionPane.showMessageDialog(null, "Now your current balance is " + balance);
        }
    }

    public void withdrawal() {
        if (withdraw > balance) {
            JOptionPane.showMessageDialog(null, "You do not have enough amount to withdraw");
        } else {
            JOptionPane.showMessageDialog(null, "You have withdrawn " + withdraw + " birr");
        }
    }

    @Override
    public String display() {
        JOptionPane.showMessageDialog(null, "WELCOME TO CBE WITHDRAWING SYSTEM");
        return null;
    }
}

class Transfer extends ATMTransaction implements test {
    Scanner s = new Scanner(System.in);
    int n = 0;
    int acc;

    public Transfer() {
        JOptionPane.showMessageDialog(null, "MONEY TRANSFER");
    }

    public void transferr() {
        boolean check = true;
        do {
            try {
                JOptionPane.showMessageDialog(null, "Enter the account number you want to transfer");
                acc = s.nextInt();

                JOptionPane.showMessageDialog(null, "Enter the amount of birr you want to transfer");
                n = s.nextInt();
                if (n <= balance) {
                    balance = balance - n;
                    JOptionPane.showMessageDialog(null, "You have successfully transferred " + n + " birr");
                } else {
                    JOptionPane.showMessageDialog(null, "You don't have enough money");
                }
                check = false;
            } catch (InputMismatchException ex) {
                JOptionPane.showMessageDialog(null, "INCORRECT ACCOUNT NUMBER PLEASE TRY AGAIN");
                s.nextLine();
            }
        } while (check);
    }

    public void balancee() {
        JOptionPane.showMessageDialog(null, "Now you have " + balance + " birr");
    }

    @Override
    public String display() {
        JOptionPane.showMessageDialog(null, "WELCOME TO CBE TRANSFERRING SYSTEM");
        return null;
    }
}

class Deposit extends ATMTransaction implements test {
    Scanner s = new Scanner(System.in);
    int x;

    public Deposit() {
        JOptionPane.showMessageDialog(null, "MONEY DEPOSITION");
    }

    public void deposit() {
        JOptionPane.showMessageDialog(null, "Enter the amount of money you want to deposit");
        x = s.nextInt();
        balance = balance + x;
        JOptionPane.showMessageDialog(null, "You have deposited " + x + " and now you have " + balance + " birr");
    }

    @Override
    public String display() {
        JOptionPane.showMessageDialog(null, "WELCOME TO CBE DEPOSITING SYSTEM");
        return null;
    }
}

interface test {
    public abstract String display();
}




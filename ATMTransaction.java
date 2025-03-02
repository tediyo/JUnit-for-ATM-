// import javax.swing.JOptionPane;

// import java.util.InputMismatchException;//for expection handling
// import java.util.Scanner;

// public abstract class ATMTransaction {
// public  int balance =10000;//balance initialization 
//      public static void main ( String[] args ) {
// Scanner s = new Scanner (System .in ) ;

// JOptionPane.showMessageDialog(null, 
//                                     "      WELCOME TO CBE  AUTOMATED TELLER MACHINE   " );
// JOptionPane.showMessageDialog(null," PLEASE ENTER YOUR PIN NUMBER");
//    int p=s.nextInt();
// if( p==1234){
// int n;
//  int z;
//  do
//  {
//  JOptionPane.showMessageDialog(null,"Choose 1 for withdraw\n"+
//                                "Choose 2 for check balance\n"+
//                                "Choose 3 for transfer\n"+
//                                "Choose 4 for deposit\n"+
//                                  "Choose 5 for exit\n"+
//                                  "Choose the operation" );
 
//  n = s. nextInt ();

// switch(n )
//  {
//  case 1:
//       WITHDRAW t= new WITHDRAW();//creating object of WITHDRAW class
//       t.display();//invoking abstract method display
//       t.withdrawal();//invoking  withdrawal method of WITHDRAW class 
//       t.balancee();//invoking balancee method
//          break ;

// case 2:
//       BALANCE v= new BALANCE();//creating object of BALANCE class
//       v.display();//invoking abstract method display
//       v.balancee();//invoking balancee method
//          break ;

//  case 3:
//      Transfer b= new Transfer() ;//creating object of Transfer class
//      b.display();//invoking abstract method display
//      b.transferr();//invoking transferr method of Transfer class 
//      b.balancee();//invoking balancee method
//          break ;

//  case 4:
//      Deposit h= new Deposit();
//      h.display();//invoking display method
//      h.deposit();//invokong deposit method of Deposit class
//           break;
//  case 5:
//      System.exit(0 ) ;//for exiting the system
 
//  default : 
//      JOptionPane.showMessageDialog(null," SORRY ...your choice is wrong");
 
//  }
//  JOptionPane.showMessageDialog(null,"To go to Main menu press 0 or 1"); 
//         z=s.nextInt();
//  }while(z==0 || z==1);
// }
//     else{
//     JOptionPane.showMessageDialog(null,"You have entered a wrong PIN...please enter the correct PIN ");
//         p=s.nextInt();
//  int n;
//  int z;
//  do
//  {
 
//  JOptionPane.showMessageDialog(null,"Choose 1 for withdraw\n"+
//                                "Choose 2 for check balance\n"+
//                                "Choose 3 for transfer\n"+
//                                "Choose 4 for deposit\n"+
//                                  "Choose 5 for exit\n"+
//                                  "Choose the operation" );
 
//  n = s. nextInt ();

// switch(n )
//  {
//  case 1:
//       WITHDRAW t= new WITHDRAW();//creating object of WITHDRAW class
//       t.display();//invoking abstract method display
//       t.withdrawal();//invoking  withdrawal method of WITHDRAW class 
//       t.balancee();//invoking balancee method
//          break ;

// case 2:
//       BALANCE v= new BALANCE();//creating object of BALANCE class
//       v.display();//invoking abstract method display
//       v.balancee();//invoking balancee method
//          break ;

//  case 3:
//      Transfer b= new Transfer() ;//creating object of Transfer class
//      b.display();//invoking abstract method display
//      b.transferr();//invoking transferr method of Transfer class 
//      b.balancee();//invoking balancee method
//          break ;

//  case 4:
//      Deposit h= new Deposit();
//      h.display();//invoking display method
//      h.deposit();//invokong deposit method of Deposit class
//           break;
//  case 5:
//      System.exit(0 ) ;//for exiting the system
 
//  default : 
//      JOptionPane.showMessageDialog(null," SORRY ...your choice is wrong");
 
//  }
//  JOptionPane.showMessageDialog(null,"To go to Main menu press 0 or 1"); 
//         z=s.nextInt();
//  }while(z==0 || z==1);
// }
//   public   abstract String display();//abstract method display
// }

// class BALANCE extends ATMTransaction implements test{  //BALANCE is subclass of ATMTransaction
    
//      public BALANCE(){   // non arg constructor 
//         JOptionPane.showMessageDialog(null,"Your account current balance is "+ balance );
//     }
       
//      public int balancee(){ 
//          return balance;
//     }
//     @Override //overriding the abstract method display
//     public String display(){
// JOptionPane.showMessageDialog(null,"WELCOME TO CBE BALANCE CHECKING SYSTEM" );
//         return null;
// }
// }

//     class WITHDRAW extends ATMTransaction implements test{  //WITHDRAW is subclass of ATMTransaction
     
//      Scanner s = new Scanner (System .in ) ; 
//     int withdraw= 0;  //intializing withdraw 
        
//     public WITHDRAW()
//     {
//        JOptionPane.showMessageDialog(null," Enter the amount you want to withdraw ");
//          withdraw =s.nextInt();
//      }
//     public void balancee(){
//          if(withdraw>balance){
//         JOptionPane.showMessageDialog(null,"Your current balance is " +  balance );
//          }
//          else {
//              balance=balance-withdraw;
//        JOptionPane.showMessageDialog(null,"Now your current balance is " +  balance );
//          }
//     }
    
//     public void withdrawal(){
         
//         if(withdraw>balance)
//        {
//            JOptionPane.showMessageDialog(null,"You do not have enough amount to withdraw ");
//        }
//        else 
//        {
//            JOptionPane.showMessageDialog(null,"you have withdrawn " + withdraw + " birr" );
//        } 
       
//     }

//     @Override //overriding the abstract method display
//   public String display(){
// JOptionPane.showMessageDialog(null,"WELCOME TO CBE WITHDRAWING SYSTEM" );
//         return null;
//   }  
//    }

// class Transfer extends ATMTransaction implements test{ ////WITHDRAW is subclass of ATMTransaction
//     Scanner s = new Scanner (System .in ) ;
               
// int n=0; //initializing the amount of money to transfer
// int acc; //account number declaring
//     public Transfer() 
//     {
//        JOptionPane.showMessageDialog(null,"MONEY TRANSFER" ); 
//         }
    
//     public void transferr()
//     {
//     boolean check = true; //initializing check 
//           do{
//         try {  //Exception handling through catching 
//         JOptionPane.showMessageDialog(null,"Enter the account number you want to transfer  " ); 
//        acc=s.nextInt();
       
//          JOptionPane.showMessageDialog(null,"Enter the amount of birr you want to transfer" ); 
//            int n=s.nextInt();
//            if(n<=balance)
//            {
//                balance = balance-n;
//                JOptionPane.showMessageDialog(null,"You have successfully transfer " + n + " birr" ); 
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"you dont have enough money" );
//            }
           
//            check=false;
//          }
//            catch(InputMismatchException ex) {  
//                /* The code in the catch block is executed to handle the exception 
//                like entering other type values. for example if you enter double value 1234.0 , it catchs 
//                in to the catch block */
//                JOptionPane.showMessageDialog(null,"INCORRECT ACCOUNT NUMBER PLEASE TRY AGAIN");
//                s.nextLine(); //allows us to enter the correct account nuber on the next line
//            }   
            
//           }while(check);}

// public void balancee(){
        
//         balance = balance-n;
//        JOptionPane.showMessageDialog(null,"Now you have " + balance + " birr" );
// }

//     @Override
//   public String display(){  // overriding the abstract method display
// JOptionPane.showMessageDialog(null,"WELCOME TO CBE TRANSFERING SYSTEM" );
//         return null;
//   }
//    } 

// class Deposit extends ATMTransaction implements test{ //Deposit is subclass of ATMTransaction 
    
//      Scanner s = new Scanner (System .in ) ;
//      int x;
    
//     public Deposit() // non arg constructor
//     {
//        JOptionPane.showMessageDialog(null,"MONEY DEPOSITION");
//     }
//     public void deposit(){
//        JOptionPane.showMessageDialog(null,"Enter the amount of money you want to depose ");
//        x=s.nextInt();
//        balance = balance +x;
//          JOptionPane.showMessageDialog(null,"You have deposed  " + x +" and now you have  " + balance + "  birr");
//     }
//      @Override  // overriding the abstract method display
//     public String display(){
// JOptionPane.showMessageDialog(null,"WELCOME TO CBE DEPOSITING SYSTEM" );
//         return null;
//     }
// }

//  interface test {  // here is an interface to contain abstract method display
   
//    public abstract String display();
     
//     }





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




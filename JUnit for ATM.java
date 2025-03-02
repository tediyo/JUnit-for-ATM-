
package atm.project;

import java.util.InputMismatchException;//for expection handling
import java.util.Scanner;

public abstract class ATMTransaction {
public  int balance =10000;//balance initialization 
     public static void main ( String[] args ) {
Scanner s = new Scanner (System .in ) ;
System.out.println ("######################################################################");
System.out.println ("#                         WELCOME TO CBE                             #");
System.out. println("#                     AUTOMATED TELLER MACHINE                       #");
System.out.println ("######################################################################");
System.out. println(" PLEASE ENTER YOUR PIN NUMBER");
   int p=s.nextInt();
if( p==1234){
int n;
 int z;
 do
 {
 System.out. println ("Choose 1 for withdraw");
 System.out. println ("Choose 2 for check balance");
 System.out. println ("Choose 3 for transfer");
 System.out. println ("Choose 4 for deposit");
 System.out. println ("Choose 5 for exit");
 System.out. print ( "Choose the operation" );
 
 n = s. nextInt ();

switch(n )
 {
 case 1:
      WITHDRAW t= new WITHDRAW();//creating object of WITHDRAW class
      t.display();//invoking abstract method display
      t.withdrawal();//invoking  withdrawal method of WITHDRAW class 
      t.balancee();//invoking balancee method
         break ;

case 2:
      BALANCE v= new BALANCE();//creating object of BALANCE class
      v.display();//invoking abstract method display
      v.balancee();//invoking balancee method
         break ;

 case 3:
     Transfer b= new Transfer() ;//creating object of Transfer class
     b.display();//invoking abstract method display
     b.transferr();//invoking transferr method of Transfer class 
     b.balancee();//invoking balancee method
         break ;

 case 4:
     Deposit h= new Deposit();
     h.display();//invoking display method
     h.deposit();//invokong deposit method of Deposit class
          break;
 case 5:
     System.exit(0 ) ;//for exiting the system
 
 default : 
     System.out.println(" SORRY ...your choice is wrong");
 
 }
 System.out.println("To go to Main menu press 0 or 1"); 
        z=s.nextInt();
 }while(z==0 || z==1);
}
    else{
     System.out.println("You have entered a wrong PIN...please enter the correct PIN ");
        p=s.nextInt();
 int n;
 int z;
 do
 {
 System.out. println ("Choose 1 for withdraw");
 System.out. println ("Choose 2 for check balance");
 System.out. println ("Choose 3 for transfer");
 System.out. println ("Choose 4 for deposit");
 System.out. println ("Choose 5 for exit");
 System.out. print ( "Choose the operation" );
  
 n = s. nextInt ();

switch(n )
 {
 case 1:
      WITHDRAW t= new WITHDRAW();//creating object of WITHDRAW class
      t.display();//invoking abstract method display
      t.withdrawal();//invoking  withdrawal method of WITHDRAW class 
      t.balancee();//invoking balancee method
         break ;

case 2:
      BALANCE v= new BALANCE();//creating object of BALANCE class
      v.display();//invoking abstract method display
      v.balancee();//invoking balancee method
         break ;

 case 3:
     Transfer b= new Transfer() ;//creating object of Transfer class
     b.display();//invoking abstract method display
     b.transferr();//invoking transferr method of Transfer class 
     b.balancee();//invoking balancee method
         break ;

 case 4:
     Deposit h= new Deposit();
     h.display();//invoking display method
     h.deposit();//invokong deposit method of Deposit class
          break;
 case 5:
     System.exit(0 ) ;//for exiting the system
 
 default : 
     System.out.println(" SORRY ...your choice is wrong");
 
 }
 System.out.println("To go to Main menu press 0 or 1"); 
        z=s.nextInt();
 }while(z==0 || z==1);
}
  public   abstract String display();//abstract method display
}

class BALANCE extends ATMTransaction implements test{  //BALANCE is subclass of ATMTransaction
    
     public BALANCE(){   // non arg constructor 
        System.out.println("Your account current balance is "+ balance );
    }
       
     public int balancee(){ 
         return balance;
    }
    @Override //overriding the abstract method display
    public String display(){
System.out.println("WELCOME TO CBE BALANCE CHECKING SYSTEM" );
        return null;
}
}

    class WITHDRAW extends ATMTransaction implements test{  //WITHDRAW is subclass of ATMTransaction
     
     Scanner s = new Scanner (System .in ) ; 
    int withdraw= 0;  //intializing withdraw 
        
    public WITHDRAW()
    {
        System.out.println(" Enter the amount you want to withdraw ");
         withdraw =s.nextInt();
     }
    public void balancee(){
         if(withdraw>balance){
        System.out.println("Your current balance is " +  balance );
         }
         else {
             balance=balance-withdraw;
        System.out.println("Now your current balance is " +  balance );
         }
    }
    
    public void withdrawal(){
         
        if(withdraw>balance)
       {
           System.out.println("You do not have enough amount to withdraw ");
       }
       else 
       {
           System.out.println("you have withdrawn " + withdraw + " birr" );
       } 
       
    }

    @Override //overriding the abstract method display
  public String display(){
System.out.println("WELCOME TO CBE WITHDRAWING SYSTEM" );
        return null;
  }  
   }

class Transfer extends ATMTransaction implements test{ ////WITHDRAW is subclass of ATMTransaction
    Scanner s = new Scanner (System .in ) ;
               
int n=0; //initializing the amount of money to transfer
int acc; //account number declaring
    public Transfer() 
    {
       System.out.println("MONEY TRANSFER" ); 
        }
    
    public void transferr()
    {
    boolean check = true; //initializing check 
          do{
        try {  //Exception handling through catching 
         System.out.println("Enter the account number you want to transfer  " ); 
       acc=s.nextInt();
       
          System.out.println("Enter the amount of birr you want to transfer" ); 
           int n=s.nextInt();
           if(n<=balance)
           {
               balance = balance-n;
               System.out.println("You have successfully transfer " + n + " birr" ); 
           }
           else
           {
               System.out.println("you dont have enough money" );
           }
           
           check=false;
         }
           catch(InputMismatchException ex) {  
               /* The code in the catch block is executed to handle the exception 
               like entering other type values. for example if you enter double value 1234.0 */
               System.out. println ("INCORRECT ACCOUNT NUMBER PLEASE TRY AGAIN");
               s.nextLine(); //allows us to enter the correct account nuber on the next line
           }   
            
          }while(check);}

public void balancee(){
        
        balance = balance-n;
          System.out.println("Now you have " + balance + " birr" );
}

    @Override
  public String display(){  // overriding the abstract method display
System.out.println("WELCOME TO CBE TRANSFERING SYSTEM" );
        return null;
  }
   } 

class Deposit extends ATMTransaction implements test{ //Deposit is subclass of ATMTransaction 
    
     Scanner s = new Scanner (System .in ) ;
     int x;
    
    public Deposit() // non arg constructor
    {
        System.out.println ("MONEY DEPOSITION");
    }
    public void deposit(){
       System.out.println ("Enter the amount of money you want to depose ");
       x=s.nextInt();
       balance = balance +x;
         System.out.println ("You have deposed  " + x +" and now you have  " + balance + "  birr");
    }
     @Override  // overriding the abstract method display
    public String display(){
System.out.println("WELCOME TO CBE DEPOSITING SYSTEM" );
        return null;
    }
}

 interface test {  // here is an interface to contain abstract method display
   
   public abstract String display();
     
    }









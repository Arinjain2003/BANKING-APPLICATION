import java.util.*;
public class BankingApplication {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your name and customer id : ");
      String name = sc.next();
      String id = sc.next();

      BankAccount ob = new BankAccount(name , id);

       ob.menudisplay();


  }

}

  class BankAccount{
    int balance;
    int pasttransaction;
      String customername;
      String customerid;

      BankAccount(String name , String id){
          customername = name;
          customerid =id;

      }

      void deposit(int amount){
          if(amount>0)
          {
              balance=balance+amount;
              pasttransaction=amount;
          }

      }

       void withdraw(int amount){
           if(amount>0)
           {
               balance=balance-amount;
               pasttransaction=-amount;

           }

       }

      void getPastTransaction()
      {
          if(pasttransaction<0)
              System.out.println("Withdrawn:Rs."+Math.abs(pasttransaction));
          else if(pasttransaction>0)
              System.out.println("Deposited:Rs."+pasttransaction);
          else
              System.out.println("No transaction has occurred.");

      }

      void menudisplay(){

          char choice;
          Scanner sc = new Scanner(System.in);
          System.out.println("Welcome"+" "+customername);
          System.out.println("Your customer id:"+customerid);
          System.out.println("\n");
          System.out.println("A.Check Balance");
          System.out.println("B.Deposit");
          System.out.println("C.Withdraw");
          System.out.println("D.Previous Transaction");
          System.out.println("E.Exit");

          do {
              System.out.println("*************************************");
              System.out.println("Enter an option.");
              System.out.println("*************************************");
              choice = sc.next().charAt(0);
              System.out.println("\n");
              switch (choice) {
                  case 'A':
                      System.out.println("**************************************");
                      System.out.println("Balance:Rs." + balance);
                      System.out.println("**************************************");
                      System.out.println("\n");
                      break;
                  case 'B':
                      System.out.println("**************************************");
                      System.out.println("Enter an amount to deposit.");
                      System.out.println("**************************************");
                      int amount = sc.nextInt();
                      deposit(amount);
                      System.out.println("\n");
                      break;
                  case 'C':
                      System.out.println("**************************************");
                      System.out.println("Enter an amount to withdraw.");
                      System.out.println("**************************************");
                      int amount2 = sc.nextInt();
                      withdraw(amount2);
                      System.out.println("\n");
                      break;
                  case 'D':
                      System.out.println("**************************************");
                      getPastTransaction();
                      System.out.println("**************************************");
                      System.out.println("\n");
                      break;
                  case 'E':
                      System.out.println("**************************************");
                      break;
                  default:
                      System.out.println("Invalid Input!Please try again.");
              }
          }
              while (choice != 'E') ;
              System.out.println("Thank you for using our services.");

      }
}

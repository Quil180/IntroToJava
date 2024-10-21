/*
 * Yousef Awad
 * Assignment 2: Objects
 * COP 3330
 * September 15th, 2024
 */

import java.util.Scanner;

public class Bank {
  private static Account[] accounts = new Account[5];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int accountChoice = 0, menuChoice = 0;
    boolean success = false;

    // initializing the accounts in the account array so that they say they are
    // empty
    /*
     * for (int i = 0; i < 5; i++) {
     * accounts[i] = new Account("Empty", 0);
     * }
     */

    while (accountChoice != 6) {
      // the menu to print out
      System.out.println("Welciome to Knightro Banking:");
      for (int i = 0; i < accounts.length; i++) {
        if (accounts[i] == null) {
          System.out.println((i + 1) + ". Empty");
        } else {
          System.out.println((i + 1) + ". " + accounts[i].getName());
        }
      }
      System.out.println("6. Exit Program");
      System.out.println("What would you like to do?");
      accountChoice = scan.nextInt();

      if (accountChoice != 6 && accountChoice < 6 && accountChoice > 0) {
        // checking if the account exists first
        if (accounts[accountChoice - 1] == null) {
          System.out.println("Creating a new account.");
          System.out.println("What is the name of the account?");
          String accountName = scan.next();
          System.out.println("What is the interest rate?");
          double interestRate = scan.nextDouble();
          accounts[accountChoice - 1] = new Account(accountName, interestRate);
        } else {
          // now for each of the choices!!!
          System.out.println("What would you like to do?");
          System.out.println("1. Deposit Funds");
          System.out.println("2. Withdraw Funds");
          System.out.println("3. Check Balance");
          System.out.println("4. Calculate Interest");
          System.out.println("5. Close Account");
          menuChoice = scan.nextInt();

          switch (menuChoice) {
            case 1:
              System.out.println("How much money do you want to deposit?");
              double deposit = scan.nextDouble();
              success = accounts[accountChoice - 1].deposit(deposit);
              if (success) {
                System.out.printf("You have deposited $%.2f.\n", deposit);
              }
              break;
            case 2:
              System.out.println("How much money do you want to withdraw?");
              double withdraw = scan.nextDouble();
              success = accounts[accountChoice - 1].withdraw(withdraw);
              if (success) {
                System.out.printf("You have withdrawn $%.2f\n", withdraw);
              }
              break;
            case 3:
              System.out.printf("You have $%.2f\n", accounts[accountChoice - 1].getBalance());
              break;
            case 4:
              System.out.println("How many months have passed?");
              int months = scan.nextInt();
              accounts[accountChoice - 1].calcInterest(months);
              break;
            case 5:
              accounts[accountChoice - 1] = null;
              System.out.println("Account was closed.");
              break;
            default:
              System.out.println("Please Select a valid option");
              break;
          }
        }
      } else if (accountChoice == 6) {
        // the user requested to exit the program
        System.out.println("Goodbye.");
      }

    }
    scan.close();
  }
}

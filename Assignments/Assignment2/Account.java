/*
 * Yousef Awad
 * Assignment 2: Objects
 * COP 3330
 * September 15th, 2024
 */

public class Account {
  private String name;
  private double balance;
  private double interestRate;

  // constructor to initialize an account
  public Account(String givenName, double rategiven) {
    this.name = givenName;
    this.interestRate = rategiven;
    this.balance = 0;
  }

  public boolean deposit(double funds) {
    if (this.balance + funds <= 0 || funds <= 0) {
      System.out.println("You have inputted an invalid number to deposit.");
      return false;
    }
    // the funds is a proper positive number
    this.balance += funds;
    return true;
  }

  public boolean withdraw(double funds) {
    if (this.balance - funds <= 0 || funds <= 0) {
      System.out.println("You have inputted an invalid number to withdraw.");
      return false;
    }
    // they inputted a valid number
    this.balance -= funds;
    return true;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getName() {
    return this.name;
  }

  public void calcInterest(int months) {
    double interestPeriod = this.interestRate * (6.00 / 12.00) / 100.00;
    this.balance = this.balance * (1 + interestPeriod);
    System.out.println("Your new balance is $" + this.balance);
  }
}

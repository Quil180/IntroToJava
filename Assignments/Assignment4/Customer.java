/*
 * Yousef Awad
 * Assignment 4: File I/O & Linked Lists
 * COP 3330
 * October 20th, 2024
 */

public class Customer {
  private String name;
  private boolean business;

  public Customer(String n, boolean b) {
    this.name = n;
    this.business = b;
  }

  public String getName() {
    return this.name;
  }
  public boolean getBusiness() {
    return this.business;
  }

}

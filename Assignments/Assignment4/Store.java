/*
 * Yousef Awad
 * Assignment 4: File I/O & Linked Lists
 * COP 3330
 * October 20th, 2024
 */

import java.io.*;
import java.util.*;

public class Store {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the filename you are trying to intput?");
    String path = scan.nextLine();

    LinkedList<Customer> Customers = new LinkedList<>(); // the checkout queue

    // accessing the file and then getting the data.
    try {
      File in = new File(path);
      Scanner inscan = new Scanner(in);
      int customerCount = Integer.parseInt(inscan.nextLine());

      for (int i = 0; i < customerCount; i++) {
        String name = inscan.next();
        boolean business = inscan.nextBoolean();
        Customer temporary = new Customer(name, business);
        // add this customer to the checkout line.
        Customers.add(i, temporary);
      }

      inscan.close();
    } catch (FileNotFoundException e) {
      System.out.println("File you inputted not found.");
      scan.close();
      return;
    }
    scan.close();

    LinkedList<Customer> returnLane = new LinkedList<>(); // the return queue

    // going through the checkout line (the linked list)
    while (Customers.size() != 0) {
      // while the checkout lane isn't empty
      // check 2 customers.
      for (int i = 0; i < 2; i++) {
        if (Customers.size() != 0) {
          if (Customers.get(0).getBusiness()) {
            // the customer is returning a product
            System.out.println(Customers.get(0).getName() + " was forwarded to the return lane.");
            // adding the customer to the return lane and removing them from the checkout
            // lane.
            returnLane.add(Customers.get(0));
            Customers.remove(0);
          } else {
            // the customer is buying a product.
            System.out.println(Customers.get(0).getName() + " checked out");
            // the customer checked out so remove them from the check out lane.
            Customers.remove(0);
          }
        }
      }

      // check the return lane and if someone is in it, let them return the item.
      if (!(returnLane.isEmpty())) {
        // if the returning line has someone in it.
        System.out.println(returnLane.get(0).getName() + " returned an item");
        returnLane.remove(0);
      }
    }
  }
}

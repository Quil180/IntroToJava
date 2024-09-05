/*
 * Yousef Awad - COP3330-0002 - August 28, 2024 - Assignment 0 "Welcome to OOP!"
*/

import java.util.*;

public class Daytona {

  // Static variable (all methods can use it)
  public static Scanner scan;

  public static int menu() {
    System.out.println("What would you like to do?");
    System.out.println("1. Drive on the Beach.");
    System.out.println("2. Play Disc Golf.");
    System.out.println("3. See the race.");
    System.out.println("4. Exit");
    int choice = scan.nextInt();
    scan.nextLine();
    return choice;
  }

  public static void driveBeach() {
    System.out.println("What time did Knightro get to the beach?");
    int time = scan.nextInt();
    scan.nextLine();
    if (time >= 9 && time <= 18) {
      System.out.println("Enjoy your drive!");
    } else {
      System.out.println("Oh no! The beach is closed.");
    }
  }

  public static void playGolf() {
    int feetLeft = 397;

    System.out.println("Welcome to the park!");
    while (feetLeft != 0) {
      System.out.println("There is " + feetLeft + " feet left until the basket.");
      System.out.println("How far did you throw?");
      int toss = scan.nextInt();
      scan.nextLine();
      feetLeft -= toss;
      if (feetLeft < 0) {
        feetLeft *= -1;
      }
    }
    System.out.println("You made it in!");
  }

  public static void seeRace() {
    int laps = 0;

    System.out.println("How many laps are left?");
    laps = scan.nextInt();
    scan.nextLine();
    while (laps > 0) {
      System.out.println("There are " + laps + " laps left.");
      laps--;
    }
    System.out.println("Finished!");
    System.out.println();
  }

  public static void main(String[] args) {
    // declaring what the global scanner named scan is.
    scan = new Scanner(System.in);

    // basic welcome message before the meny is called.
    System.out.println("Welcome to Daytona Beach!");
    int choice = -1;
    while (choice != 4) {
      choice = menu();
      System.out.println();
      switch (choice) {
        case 1:
          driveBeach();
          break;
        case 2:
          playGolf();
          break;
        case 3:
          seeRace();
          break;
        case 4:
          System.out.println("Goodbye.");
          break;
        default:
          System.out.println("Please Select a valid option.");
      }

    }

  }
}

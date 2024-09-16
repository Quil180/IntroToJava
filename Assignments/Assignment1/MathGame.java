/* Yousef Awad
 * COP 3330
 * Assignment 1 - 9-08-2024
*/

/*
 * Goals
 * Ask the user how many numbers (2 to 20) they want to generate
 * Create n random values and store them (from 5 to 20)
 * Create a menu to play a game, shuffle, generate new numbers, sort, or exit
 *
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathGame {
  public static void menu() {
    System.out.println("Select your option:");
    System.out.println("1. Play Game");
    System.out.println("2. Swap Values");
    System.out.println("3. New Values");
    System.out.println("4. Sort");
    System.out.println("5. Exit");
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Welcome to the random number generator!");
    System.out.println("How many values would you like to use:");
    int number = scan.nextInt();

    // declaring the int array of length number
    int[] array = new int[number];

    // filling the array
    for (int i = 0; i < number; i++) {
      // generates a random number between 0 and 15, then adds 5 to make the minimum
      // value 5 and maximum of 20.
      array[i] = random.nextInt(16) + 5;
    }

    int exit = 0;

    while (exit == 0) {
      // printing the menu
      menu();
      // asking the user for their choice
      int choice = scan.nextInt();
      switch (choice) {
        case 1:
          int correct = 0;
          System.out.println("Add these values:");
          printArray(array);
          // for loop to get the sum of all the array indexes
          for (int i = 0; i < array.length; i++) {
            correct += array[i];
          }
          int answer = scan.nextInt();
          if (answer != correct) {
            // assuming the answer is wrong
            System.out.println("That was incorrect. The value adds to be: " + correct);
          } else {
            // assuming the answer is correct
            System.out.println("That is correct!");
          }
          break;
        case 2:
          // printing out every array number
          System.out.print("Current: ");
          printArray(array);
          // asking for number of times to swap
          System.out.println("How many swaps?");
          int swaps = scan.nextInt();
          // now we can swap that amount of indexes
          for (int i = 0; i < swaps; i++) {
            int one = -1, two = -1;
            while (one == two) {
              // ensuring the numbers are not the same
              // as well as generating their indexes
              one = random.nextInt(array.length);
              two = random.nextInt(array.length);
            }
            // swapping the two randomly chosen array addresses.
            int temp = array[one];
            array[one] = array[two];
            array[two] = temp;
          }
          // printing out the new array numbers
          System.out.print("Final Swapped Values: ");
          printArray(array);
          break;
        case 3:
          // for loop to regenerate all numbers
          for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16) + 5;
          }
          // printing the new array values
          System.out.print("Final New Values: ");
          printArray(array);
          break;
        case 4:
          System.out.print("Current Values: ");
          printArray(array);
          // sorting the array via the function call
          Arrays.sort(array, 0, array.length);
          // printing the sorted array values
          System.out.print("Final Sorted Values: ");
          printArray(array);
          break;
        case 5:
          System.out.println("Goodbye.");
          exit = 1;
          break;
        default:
          System.out.println("Please Select a Valid Choice");
          break;
      }
      System.out.println();
    }

    scan.close();
  }

}

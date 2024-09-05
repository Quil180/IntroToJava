import java.util.Scanner;

public class YousefStore {

  // Static variable (all methods can use it)
  public static Scanner scan;

  public static int menu() {
    System.out.println("What do you do?");
    System.out.println("1 - Pick Fruit");
    System.out.println("2 - Fruit Total");
    System.out.println("3 - Exit");
    final int choice = scan.nextInt();
    scan.nextLine();
    return choice;
  }

  public static void pickFruit(int[] fruits) { // remember that arrays are passed by reference and not by value
    System.out.println("What type of tree are you picking?");
    final String name = scan.nextLine();
    System.out.println("How many " + name + " are you picking?");
    final int amount = scan.nextInt();
    if (name.equals("Meyer")) {
      fruits[0] += amount;
    }
    if (name.equals("Simmonds")) {
      fruits[1] += amount;
    }
    if (name.equals("Brogdon")) {
      fruits[2] += amount;
    }
    if (name.equals("Key Lime")) {
      fruits[3] += amount;
    }
    if (name.equals("Pink Lemon")) {
      fruits[4] += amount;
    }
  }

  public static void showFruits(int[] total) {
    System.out.println("This is the totals for the fruits you have picked.");
    System.out.println("Meyer Lemon: " + total[0]);
    System.out.println("Simmonds Avocado: " + total[1]);
    System.out.println("Brogdon Avocado: " + total[2]);
    System.out.println("Key Lime: " + total[3]);
    System.out.println("Pink Lemon: " + total[4]);
  }

  public static void main(String[] args) {
    // declaring what the global scanner named scan is.
    scan = new Scanner(System.in);

    /*
     * 0 - Meyer Lemon
     * 1 - Simmonds Avocado
     * 2 - Brogdon Avocado
     * 3 - Key Lime
     * 4 - Pink Lemon
     */
    final int[] trees = new int[5];
    int options = -1;
    while (options != 3) {
      options = menu();
      System.out.println();
      switch (options) {
        case 1:
          pickFruit(trees);
          System.out.println();
          break;
        case 2:
          showFruits(trees);
          System.out.println();
          break;
        case 3:
          break;
        default:
          System.out.println("Please Select a valid option.");
      }

    }

  }
}

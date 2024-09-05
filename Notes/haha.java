import java.util.*;

public class haha {

  // this is a static method. it doesnt belong to an object (whatever an object
  // is).
  public static void function1(int x) { // the function is public in that it can be used anywhere. private can only be
                                        // used inside of the class proper.
    x += 2;
  }

  public static void function2(int[] n) {
    for (int i = 0; i < n.length; i++) {
      n[i] += 2;
    }
  }

  // creating a method called main. (java doesnt have functions like cpp and C).
  public static void main(String[] args) {
    System.out.println("Hello World, this is Java!");

    int[] arrayName = new int[5]; // this is how you create a new array in Java. Of which by, default, all the
                                  // values are 0.

    Arrays.fill(arrayName, 7); // sets the value of all the values of arrayName to 7! (it overwrites the data
                               // in the array)
    for (int i = 0; i < arrayName.length; i++) { // for loops are the exact same as in C.
      // arrayName[i] = i;
      System.out.println(arrayName[i]);
    }

    int x = 5;
    function1(x); // we are passing by value, here, not its address/pointer as its not possible
                  // traditionally :(
    System.out.println(x);

    function2(arrayName);
    for (int i = 0; i < arrayName.length; i++) { // for loops are the exact same as in C.
      System.out.println(arrayName[i]);
    }

    // the only things that pass by reference arrays and objects (not tradition data
    // types).
    // Strings are different, though, as its techincally an object, BUT its
    // immutable, and therefore unchangable.

  }
}

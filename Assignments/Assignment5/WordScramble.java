/*
 * Yousef Awad
 * Assignment 5: Stacks
 * COP 3330
 * October 27th, 2024
 */
import java.util.Stack;

public class WordScramble {

  public static String encode(String input) {

    // create a stack object
    Stack<Character> stack = new Stack<Character>();

    // create a string or a StringBuilder object
    StringBuilder almostResult = new StringBuilder();

    // iterate over the input string looking at each character
    for (int i = 0; i < input.length(); i++) {
      // if it is a 2, add to the string/StringBuilder what pops out of stack
      if (input.charAt(i) == '1') {
      } else if (input.charAt(i) == '2') {
        if (!stack.isEmpty()) {
          char group = stack.pop();
          almostResult.append(group);
        }
      } else if ("AEIOUaeiou".indexOf(input.charAt(i)) >= 0) {
        stack.push(input.charAt(i));
      } else {
        almostResult.append(input.charAt(i));
      }
    }

    // Return the string/stringbuilder (if using string builder return the string)
    return almostResult.toString();
  }

  public static void main(String[] args) {
    System.out.println(encode("1top2"));
    System.out.println(encode("11top2e1cat22"));
    System.out.println(encode("111tom2op2it2"));
    System.out.println(encode("11top2i1tom22"));
  }
}

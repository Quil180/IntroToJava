public class exam1 {
  // cool people questions
  public static int question1(int x) {
    // any number greater than 50 will return x / 2 (as it will go to the first
    // return, and not the second)
    if (x >= 50) {
      return x / 2;
    }
    // any number not greater than 50 but less than or equal to 65 will be x * 2
    if (x <= 65) {
      return x * 2;
    }
    // it will never go to this so.....
    return x; // this is unreachable :((
  }

  // method overloading??!!!!!
  public static int question1(int x, int y) {
    return question1(x) + question1(y); // calls the function above
  }

  public static int[] question2(int x, int[] y) { // we are returning an integer array (seen via int[] after static)
    for (int i = 0; i < y.length; i++) {
      if (y[i] % x == 0) {
        y[i] = 0; // if the array element is perfectly divisible by x, then set the element to 0.
      }
    }
    // return the new array that we get.
    return y;
  }

  public static void main(String[] args) {

    question1(100); // returns 50
    question1(60); // returns 30
    question1(100, 60); // returns 50 + 30 or 80

    question1(5, 10); // will get you a return value 30.

    String name = "Yousef Awad";
    System.out.println(name.substring(2)); // will start at index 2 (aka u) to the end

    System.out.println(name.substring(0, 2)); // will start at index 0 (Y) to index 2 (O)

    // could do it like this too
    System.out.println(name.substring(2, name.length() - 2)); // starts at index 2 (U) and goes to the 2nd to last index
                                                              // (W)
    // spaces count as an index, btw

    // now what if you want to take the first 2 letters of my first name, and the
    // last 2 of my last name
    String combined = name.substring(0, 2) + name.substring(name.length() - 2);
    // now my name is Yoad >:)
    System.out.println(combined);

  }
}

import java.util.LinkedList;
import java.util.Stack;

public class exam2 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>(); // we got a funny stack
    // top is on the left
    st.push(9); // 9
    st.push(10); // 10 9
    System.out.println(st.peek()); // print 10, 10 9
    st.push(3); // 3 10 9
    System.out.println(st.pop()); // print 3, 10 9
    System.out.println(st.peek()); // print 10, 10 9
    System.out.println(st.pop()); // print 10, 9
    st.push(1); // 1 9
    // what is it gonna print and what is remainng in the stack?
    // Stacks have "First in, Last out."

    LinkedList<Integer> qu = new LinkedList<Integer>(); // making a queue
    // Queue's are "First in, First out"
    // read left to right
    qu.add(3); // 3
    qu.add(5); // 3 5
    System.out.println(qu.peek()); // print 3, 3 5
    System.out.println(qu.poll()); // print 3, 5
    qu.add(6); // 5 6

    

  }
}

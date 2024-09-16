public class listrunner {
  public static void main(String[] args) {
    linkedlist decList = new linkedlist(7);

    System.out.println(decList.getValue());
    decList.insertAfter(100);
    decList.printLists();
  }
}

public class linkedlist {
  private int value;
  private linkedlist next;

  public linkedlist(int v) {
    this.value = v;
    this.next = null;
  }

  public int getValue() {
    return this.value;
  }

  public void printLists() {
    System.out.print(this.value + "->");
    if (this.next != null) {
      this.next.printLists();
    } else {
      System.out.print("null");
    }
    System.out.println();
  }

  public void insertAfterSort(int value) {
    if (this.next != null) {
      if ()
      linkedlist temp = new linkedlist(value);
      temp.next = this.next;
      this.next = temp;
    } else {
      this.next = new linkedlist(value);
    }
    // the linked list is made!!!!
  }

  public void insertAfter(int value) {
    linkedlist temp = new linkedlist(value);
    temp.next = this.next;
    this.next = temp;
    // the linked list is made!!!!
  }

  public void deleteValue(int value) {
    if (this.next != null) {
      if (this.next.value == value) {
        // we found the thing we need to delete
        this.next = this.next.next; // me when next next next
        // the funny garbage collector will then magically remove it eventually
      }
    }
  }

}

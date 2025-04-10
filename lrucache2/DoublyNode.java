package lrucache2;

public class DoublyNode {
  public int value;
  public DoublyNode next;
  public DoublyNode previous;

  public DoublyNode(int value) {
    this.value = value;
    next = null;
    previous = null;
  }

}

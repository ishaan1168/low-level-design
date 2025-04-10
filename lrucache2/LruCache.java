package lrucache2;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
  private Map<Integer, DoublyNode> map;
  private DoublyNode head;
  private DoublyNode tail;
  private int size;
  public LruCache(int size) {
    this.size = size;
    map = HashMap.newHashMap(size);
    head = new DoublyNode(-1);
    tail = new DoublyNode(-1);
    head.next = tail;
    tail.previous = head;
  }

  public void insert(int value) {
    if(map.containsKey(value)) {
      DoublyNode node = map.get(value);
      node.previous.next = node.next;
      node.next.previous = node.previous;
      DoublyNode prevFirst = head.next;
      head.next = node;
      node.previous = head;
      node.next = prevFirst;
      prevFirst.previous = node;
    }
    else {
      if (map.size() == size) {
        int del = tail.previous.value;
        DoublyNode delnode = tail.previous;
        map.remove(del);
        delnode.previous.next = tail;
        tail.previous = delnode.previous;
      }
      DoublyNode node = new DoublyNode(value);
      DoublyNode prevFirst = head.next;
      head.next = node;
      node.previous = head;
      node.next = prevFirst;
      prevFirst.previous = node;
      map.put(value, node);
    }
  }

  public void printList() {
    DoublyNode pointer = head;
    while(head != null) {
      System.out.println(head.value);
      head = head.next;
    }
    head = pointer;
  }

}

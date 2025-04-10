package designpattern.observer_designpattern;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Observer observer1 = new ConcreteObserver();
    Observer observer2 = new ConcreteObserver();
    Subject subject = new Subject(new ArrayList<>());
    subject.addObserver(observer1);
    subject.addObserver(observer2);
    subject.changeOccurred();
  }
}

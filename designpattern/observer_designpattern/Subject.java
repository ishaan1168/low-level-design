package designpattern.observer_designpattern;

import java.util.List;

public class Subject {
  List<Observer> observerList;

  public Subject(List<Observer> observerList) {
    this.observerList = observerList;
  }

  public void addObserver(Observer observer) {
    observerList.add(observer);
  }

  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }

  public void changeOccurred() {
    observerList.forEach(Observer::notifyChange);
  }
}

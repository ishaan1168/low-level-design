package designpattern.observer_designpattern;

public class ConcreteObserver implements Observer{
  @Override
  public void notifyChange() {
    System.out.println("Changed");
  }
}

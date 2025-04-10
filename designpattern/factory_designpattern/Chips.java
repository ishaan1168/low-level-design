package designpattern.factory_designpattern;

public class Chips extends Product{
  Chips(int id, String name) {
    super(id);
  }

  @Override
  void display() {
    System.out.println("This is Chips");
  }
}

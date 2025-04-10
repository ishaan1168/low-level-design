package designpattern.factory_designpattern;

public class Soda extends Product{
  Soda(int id, String name) {
    super(id);
  }

  @Override
  void display() {
    System.out.println("This is soda");
  }
}

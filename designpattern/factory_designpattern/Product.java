package designpattern.factory_designpattern;

public abstract class Product {
  int id;
  Product(int id) {
    this.id = id;
  }
  abstract void display();
}

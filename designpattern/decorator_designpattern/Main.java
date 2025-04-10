package designpattern.decorator_designpattern;

public class Main {
  public static void main(String[] args) {
    Pizza pizza = new JalapenoDecorator(new ChesseDecorator(new VegPizza()));
    System.out.println(pizza.bake());
  }
}
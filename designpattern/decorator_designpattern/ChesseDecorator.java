package designpattern.decorator_designpattern;

public class ChesseDecorator extends PizzaDecorator {
  ChesseDecorator(Pizza pizza) {
    super(pizza);
  }
  @Override
  public String bake() {
    return this.decoratedPizza.bake() + " Chesse ";
  }
}

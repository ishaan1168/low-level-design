package designpattern.decorator_designpattern;

public class JalapenoDecorator extends PizzaDecorator{
  JalapenoDecorator(Pizza pizza) {
    super(pizza);
  }
  @Override
  public String bake() {
    return this.decoratedPizza.bake() + "Jalapeno";
  }
}

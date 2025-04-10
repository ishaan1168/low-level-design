package designpattern.decorator_designpattern;

public abstract class PizzaDecorator implements Pizza{
  Pizza decoratedPizza;
  PizzaDecorator(Pizza decoratedPizza) {
    this.decoratedPizza = decoratedPizza;
  }
  public String bake(){
    return decoratedPizza.bake();
  }
}

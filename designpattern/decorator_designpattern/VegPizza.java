package designpattern.decorator_designpattern;

public class VegPizza implements Pizza {
  @Override
  public String bake() {
    return "Veg Pizza";
  }
}

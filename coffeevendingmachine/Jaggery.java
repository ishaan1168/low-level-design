package coffeevendingmachine;

public class Jaggery extends Coffee{
  Coffee coffee;

  public Jaggery(Coffee coffee) {
    this.coffee = coffee;
  }

  public String type() {
    return this.coffee.type() + " Jaggery";
  }
  public int cost() {
    return this.coffee.cost() + 50;
  }
}

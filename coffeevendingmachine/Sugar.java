package coffeevendingmachine;

public class Sugar extends Coffee{
  Coffee coffee;

  public Sugar(Coffee coffee) {
    this.coffee = coffee;
  }

  public String type() {
    return this.coffee.type() + " Sugar";
  }

  public int cost() {
    return this.coffee.cost() + 50;
  }
}

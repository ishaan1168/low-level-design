package coffeevendingmachine;

import java.util.Objects;

public class Main {
  public static Coffee selectDrink(String type) {
    if(Objects.equals(type, "Cappucino"))
      return new Cappucino();
    else if(Objects.equals(type, "Latte"))
      return new Latte();
    else
      return new Latte();
  }
  public static void main(String[] args) {
    VendingMachine vendingMachine = VendingMachine.getInstance();
//    Coffee coffee = selectDrink("Cappucino");
    Coffee coffee = new Sugar(new Jaggery(new Cappucino()));
    System.out.println(coffee.cost());
  }
}
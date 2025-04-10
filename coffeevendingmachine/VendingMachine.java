package coffeevendingmachine;

public class VendingMachine {
  private static VendingMachine instance = null;
  private VendingMachine() {}
  public static synchronized VendingMachine getInstance() {
    if(instance == null)
      instance = new VendingMachine();
    return instance;
  }

  public void selectTopping(String drink) {

  }
}

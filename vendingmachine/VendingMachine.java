package vendingmachine;

public class VendingMachine {
  private static VendingMachine instance = null;
  private CurrentState currentState;
  private int amount;
  private VendingMachine(){
    currentState = CurrentState.IDLE;
    amount = 0;
  }
  public static VendingMachine getInstance() {
    if(instance == null)
      instance = new VendingMachine();
    return instance;
  }

  public void setCurrentState(CurrentState currentState) {
    this.currentState = currentState;
  }

  public CurrentState getCurrentState() {
    return this.currentState;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount += amount;
  }
}

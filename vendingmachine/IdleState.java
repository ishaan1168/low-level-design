package vendingmachine;

public class IdleState implements State{
  VendingMachine vendingMachine;

  IdleState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(int amount) {
    vendingMachine.setCurrentState(CurrentState.MONEY_INSERTED);
    vendingMachine.setAmount(amount);
  }

  @Override
  public void makeSelection(int id) {
    throw new IllegalStateException("Not a valid operation");
  }
}

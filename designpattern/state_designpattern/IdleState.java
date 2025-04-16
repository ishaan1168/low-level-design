package designpattern.state_designpattern;

public class IdleState implements State{
  VendingMachine vendingMachine;

  IdleState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(int amount) {
    vendingMachine.setCurrentAmount(vendingMachine.getCurrentAmount()+amount);
    vendingMachine.setCurrentState(vendingMachine.moneyInsertedState);
  }

  @Override
  public void makeSelection(int id) {
    throw new IllegalStateException("Not a valid operation");
  }

  @Override
  public void collectChange() {
    throw new IllegalStateException("Nothing to collect");
  }

  @Override
  public void dispenseProduct() {
    throw new IllegalStateException("Nothing to dispense");
  }
}

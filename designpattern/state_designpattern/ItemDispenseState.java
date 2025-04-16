package designpattern.state_designpattern;

public class ItemDispenseState implements State{
  VendingMachine vendingMachine;

  public ItemDispenseState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(int amount) {
    throw new IllegalStateException("Cant insert money now");
  }

  @Override
  public void makeSelection(int id) {
    throw new IllegalStateException("Cant make selection now");
  }

  @Override
  public void collectChange() {
    throw new IllegalStateException("No change to collect now");
  }

  @Override
  public void dispenseProduct() {
    vendingMachine.setCurrentState(vendingMachine.getIdleState());
  }


}

package designpattern.state_designpattern;

public class ReturnMoneyState implements State{
  VendingMachine vendingMachine;

  ReturnMoneyState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(int amount) {
    throw new IllegalStateException("Cant insert money now");
  }

  @Override
  public void makeSelection(int id) {
    throw new IllegalStateException("Cant make a selection now");
  }

  @Override
  public void collectChange() {
    System.out.println("Money returned is " + vendingMachine.getCurrentAmount());
    vendingMachine.setCurrentAmount(0);
    vendingMachine.setCurrentState(vendingMachine.getItemDispenseState());
  }

  @Override
  public void dispenseProduct() {
    throw new IllegalStateException("First collect the change");
  }
}

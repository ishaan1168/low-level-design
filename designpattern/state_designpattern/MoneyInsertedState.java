package designpattern.state_designpattern;

public class MoneyInsertedState implements State{
  VendingMachine vendingMachine;

  public MoneyInsertedState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(int amount) {
    vendingMachine.setCurrentAmount(vendingMachine.getCurrentAmount()+amount);
  }

  @Override
  public void makeSelection(int id) {
    if(vendingMachine.getProductList().get(id).getQuantity() >= 1 && vendingMachine.getCurrentAmount() >= vendingMachine.getProductList().get(id).getAmount()) {
      vendingMachine.getProductList().get(id).setQuantity(vendingMachine.getProductList().get(id).getQuantity()-1);
      vendingMachine.setCurrentAmount(vendingMachine.getCurrentAmount()-vendingMachine.getProductList().get(id).getAmount());
    } else {
      throw new IllegalStateException("Invalid");
    }
    vendingMachine.setCurrentState(vendingMachine.getReturnMoneyState());
  }

  @Override
  public void collectChange() {
    throw new IllegalArgumentException("No change to be collected");
  }

  @Override
  public void dispenseProduct() {
    throw new IllegalArgumentException("No product to be dispensed");
  }
}

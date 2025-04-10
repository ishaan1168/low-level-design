package vendingmachine;

public class ItemDispenseState implements State{
  VendingMachine vendingMachine;

  ItemDispenseState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(int amount) {
    
  }

  @Override
  public void makeSelection(int id) {

  }
}

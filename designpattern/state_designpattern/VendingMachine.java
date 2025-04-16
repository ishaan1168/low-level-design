package designpattern.state_designpattern;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {
  private static VendingMachine instance = null;
  State idleState;
  State moneyInsertedState;
  State itemDispenseState;
  State returnMoneyState;
  State currentState;
  List<Product> productList;
  int currentAmount;

  VendingMachine() {
    productList = new ArrayList<>();
    currentAmount = 0;
    idleState = new IdleState(this);
    moneyInsertedState = new MoneyInsertedState(this);
    returnMoneyState = new ReturnMoneyState(this);
    itemDispenseState = new ItemDispenseState(this);
    currentState = idleState;
  }

  public static VendingMachine getInstance() {
    if(instance == null)
      instance = new VendingMachine();
    return instance;
  }

  public void addProduct(Product product) {
    productList.add(product);
  }

  public void addMoney(int amount) {
    this.currentState.insertMoney(amount);
    System.out.println("Current amount is " + currentAmount);
  }

  public void makeSelection(int id) {
    this.currentState.makeSelection(id);
    System.out.println("Item selected is " + productList.get(id).getProductType().toString());
  }

  public void returnChange() {
    this.currentState.collectChange();
  }

  public void dispenseProduct() {
    this.currentState.dispenseProduct();
  }
}

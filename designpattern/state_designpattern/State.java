package designpattern.state_designpattern;

public interface State {
  void insertMoney(int amount);
  void makeSelection(int id);
  void collectChange();
  void dispenseProduct();
}

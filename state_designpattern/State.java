package state_designpattern;

public interface State {
  void insertCoin(int amount);
  void insertNote(int amount);
  void makeSelection();
  void dispenseProduct();
  void returnMoney();
}

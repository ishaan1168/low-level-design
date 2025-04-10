package vendingmachine;

public interface State {
  void insertMoney(int amount);
  void makeSelection(int id);
}

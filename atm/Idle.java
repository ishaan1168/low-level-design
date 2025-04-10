package atm;

public class Idle implements State{

  State atmState;

  @Override
  public void cardInsertion() {
    System.out.println("card has been inserted");
  }

  @Override
  public void pinInsertion() {
    throw new RuntimeException("Cant put pin without card");
  }

  @Override
  public void amountInsertion() {
    throw new RuntimeException("Cant put Money");
  }

  @Override
  public void checkBalance() {
    throw new RuntimeException("Cant check Money");
  }

  @Override
  public void removeMoney() {
    throw new RuntimeException("Cant remove Money");
  }
}

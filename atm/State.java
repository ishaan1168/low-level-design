package atm;

public interface State {
  void cardInsertion();
  void pinInsertion();
  void amountInsertion();
  void checkBalance();
  void removeMoney();
}



//Idle state -> CardInserted state -> MoneyEject state -> Idle state

//Idle state -> Insert Card
//CardInserted state -> Put pin
//AfterPinInserted state -> Put amount, check balance
//MoneyEject state -> Remove money
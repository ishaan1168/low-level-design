package designpattern.strategy_designpattern;

public class DebitCardPayment implements Payment{
  @Override
  public void makePayment() {
    System.out.println("Debit Card Payment");
  }
}

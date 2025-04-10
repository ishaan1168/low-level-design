package designpattern.chainofresponsibility_designpattern;

public class BankPayment extends PaymentHandler{

  @Override
  public void processPayment(int amount) {
    if(amount < 500) {
      System.out.println("Bank Payment processed");
    }
    else {
      nextHandler.processPayment(amount);
    }
  }
}

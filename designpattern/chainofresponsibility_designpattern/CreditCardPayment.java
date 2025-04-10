package designpattern.chainofresponsibility_designpattern;

public class CreditCardPayment extends PaymentHandler{

  @Override
  public void processPayment(int amount) {
    if(amount<1000) {
      System.out.println("Credit Card Process payment");
    }
    else {
      nextHandler.processPayment(amount);
    }
  }
}

package designpattern.chainofresponsibility_designpattern;

public class PaypalPayment extends PaymentHandler{

  @Override
  public void processPayment(int amount) {
    if(amount<1500) {
      System.out.println("Paypal Payment processed");
    }
    else {
      nextHandler.processPayment(amount);
    }
  }
}

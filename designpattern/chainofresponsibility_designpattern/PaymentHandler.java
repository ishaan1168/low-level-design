package designpattern.chainofresponsibility_designpattern;

public abstract class PaymentHandler {
  PaymentHandler nextHandler;

  public void setNextHandler(PaymentHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public abstract void processPayment(int amount);
}

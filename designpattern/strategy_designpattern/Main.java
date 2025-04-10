package designpattern.strategy_designpattern;

public class Main {
  public static void main(String[] args) {
    PaymentService paymentService = new PaymentService(new CreditCardPayment());
    paymentService.makePayment();
    paymentService.setPayment(new DebitCardPayment());
    paymentService.makePayment();
  }
}

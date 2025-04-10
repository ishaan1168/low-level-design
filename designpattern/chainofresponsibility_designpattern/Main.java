package designpattern.chainofresponsibility_designpattern;

public class Main {
  public static void main(String[] args) {
    PaymentHandler bankPayment = new BankPayment();
    PaymentHandler creditCardPayment = new CreditCardPayment();
    PaymentHandler paypalPayment = new PaypalPayment();
    bankPayment.setNextHandler(creditCardPayment);
    creditCardPayment.setNextHandler(paypalPayment);
    bankPayment.processPayment(100);
    bankPayment.processPayment(600);
    bankPayment.processPayment(1200);
  }
}
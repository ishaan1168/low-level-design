package designpattern.strategy_designpattern;

public class PaymentService {
  Payment payment;
  PaymentService(Payment payment) {
    this.payment = payment;
  }
  void setPayment(Payment payment) {
    this.payment = payment;
  }
  void makePayment() {
    payment.makePayment();
  }
}

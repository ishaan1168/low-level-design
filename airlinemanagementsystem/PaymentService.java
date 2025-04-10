package airlinemanagementsystem;

public class PaymentService {
  PaymentProcessor paymentProcessor;
  PaymentService(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }

  public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }

  public void makePayment(int amount) {
    this.paymentProcessor.makePayment(amount);
  }
}

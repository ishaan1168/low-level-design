package airlinemanagementsystem;

public class UpiPaymentProcessor implements PaymentProcessor{
  @Override
  public void makePayment(int amount) {
    System.out.println("Made a payment of " + amount + " through UPI");
  }
}

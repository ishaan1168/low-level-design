package airlinemanagementsystem;

public class CrediCardPaymentProcessor implements PaymentProcessor{
  @Override
  public void makePayment(int amount) {
    System.out.println("Made a payment of " + amount + " through credit card");
  }
}

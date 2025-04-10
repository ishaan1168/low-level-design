package airlinemanagementsystem;

public class Main {
  public static void main(String[] args) {
    PaymentService paymentService = new PaymentService(new CrediCardPaymentProcessor());
    paymentService.makePayment(190);
    paymentService.setPaymentProcessor(new UpiPaymentProcessor());
    paymentService.makePayment(192);

    User user1 = new User(1, "Ishaan", "ishaan@gmail.com", "93232131322");
    NotificationService notificationService = new NotificationService();
    notificationService.addObserver(user1);
    notificationService.notifyAllObservers("all flights have been cancelled");
  }
}

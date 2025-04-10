package designpattern.adapter_designpattern;

public class Main {
  public static void main(String[] args) {
    Payment payment1 = new CreditCardPayment();
    payment1.makePayment();
    Payment payment2 = new AdapterPayment(new LegacyPayment());
    payment2.makePayment();
  }
}

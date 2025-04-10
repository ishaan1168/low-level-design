package designpattern.adapter_designpattern;

public class CreditCardPayment implements Payment{
  @Override
  public void makePayment() {
    System.out.println("Credit Card Payment");
  }
}

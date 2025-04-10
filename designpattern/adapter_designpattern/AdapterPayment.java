package designpattern.adapter_designpattern;

public class AdapterPayment implements Payment{
  LegacyPayment legacyPayment;
  AdapterPayment(LegacyPayment legacyPayment){
    this.legacyPayment = legacyPayment;
  }

  @Override
  public void makePayment() {
    legacyPayment.doPayment();
  }
}

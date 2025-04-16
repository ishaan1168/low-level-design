package designpattern.state_designpattern;

public class Main {
  public static void main(String[] args) {
    VendingMachine vendingMachine = VendingMachine.getInstance();

    Product product1 = new Product(0, ProductType.COKE, 25, 5);
    Product product2 = new Product(1, ProductType.PEPSI, 30, 4);
    Product product3 = new Product(2, ProductType.LAYS, 20, 7);
    Product product4 = new Product(3, ProductType.KURKURE, 100, 2);

    vendingMachine.addProduct(product1);
    vendingMachine.addProduct(product2);
    vendingMachine.addProduct(product3);
    vendingMachine.addProduct(product4);

    vendingMachine.addMoney(10);
    vendingMachine.addMoney(20);

    vendingMachine.makeSelection(0);

    vendingMachine.returnChange();

    vendingMachine.dispenseProduct();

    vendingMachine.addMoney(100);
    vendingMachine.makeSelection(3);
    vendingMachine.returnChange();
    vendingMachine.dispenseProduct();
  }
}

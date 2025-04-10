package designpattern.factory_designpattern;

public class Main {
  public static void main(String[] args) {
    ProductFactory productFactory = new ProductFactory();
    Product product1 = productFactory.generateProduct(ProductType.SODA);
    product1.display();
    Product product2 = productFactory.generateProduct(ProductType.CHIPS);
    product2.display();
  }
}

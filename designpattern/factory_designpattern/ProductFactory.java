package designpattern.factory_designpattern;

public class ProductFactory {
  public Product generateProduct(ProductType productType) {
    if(productType.equals(ProductType.CHIPS))
      return new Chips(1, "Lays");
    else if(productType.equals(ProductType.SODA))
      return new Soda(2, "Coke");
    else
      throw new IllegalArgumentException("Not a valid selection");
  }
}

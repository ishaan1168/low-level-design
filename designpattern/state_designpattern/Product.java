package designpattern.state_designpattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
  int id;
  ProductType productType;
  int amount;
  int quantity;
}

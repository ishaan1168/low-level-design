package coffeevendingmachine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cappucino extends Coffee{

  @Override
  String type() {
    return "Cappucino";
  }

  @Override
  int cost() {
    return 100;
  }
}

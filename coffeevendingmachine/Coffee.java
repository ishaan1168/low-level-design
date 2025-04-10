package coffeevendingmachine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Coffee {
  abstract String type();
  abstract int cost();
}

package traffic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Road {
  String name;
  int latitude;
  int longitude;
  int distance;

  public String getRoad() {
    return this.name;
  }
}

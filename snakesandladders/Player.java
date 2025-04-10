package snakesandladders;

public class Player {
  int id;
  String name;
  int position;

  public Player(int id, String name, int position) {
    this.id = id;
    this.name = name;
    this.position = position;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getName() {
    return this.name;
  }
}

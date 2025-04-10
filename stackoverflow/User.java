package stackoverflow;

public class User {
  String name;
  int reputation;
  public User(String name, int reputation) {
    this.name = name;
    this.reputation = reputation;
  }
  public void upvote() {
    this.reputation++;
  }
  public void downvote() {
    this.reputation--;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", reputation=" + reputation +
            '}';
  }
}

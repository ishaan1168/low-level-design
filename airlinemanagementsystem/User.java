package airlinemanagementsystem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
  int id;
  String name;
  String email;
  String mobile;

  public void notification(String message) {
    System.out.println(this.name + " has been notified of " + message);
  }
}

package airlinemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
  List<User> users;

  NotificationService() {
    this.users = new ArrayList<>();
  }

  public void addObserver(User user) {
    users.add(user);
  }

  public void removeObserver(User user) {
    users.remove(user);
  }

  public void notifyAllObservers(String message) {
    for(User user: users) {
      user.notification(message);
    }
  }
}

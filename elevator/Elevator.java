package elevator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Elevator implements Runnable{
  int id;
  int currentFloor;
  int destinationFloor;
  Direction direction;
  boolean isMoving;
  boolean running = true;
  boolean requestPending = false;

  Elevator(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    while (running) {
      if (requestPending) {
        moveToDestination();
      }

      try {
        Thread.sleep(1000); // Elevator wait time while idle
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public void acceptRequest(int startFloor, int endFloor) {
    this.currentFloor = startFloor;
    this.destinationFloor = endFloor;
    this.direction = startFloor > endFloor ? Direction.DOWN : Direction.UP;
    this.requestPending = true;
  }

  private void moveToDestination() {
    while (currentFloor != destinationFloor) {
      try {
        Thread.sleep(1000); // Simulate time it takes to move one floor
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      if (direction == Direction.UP) {
        currentFloor++;
      } else if (direction == Direction.DOWN) {
        currentFloor--;
      }
      System.out.println(this.id + " Elevator at floor: " + currentFloor);
    }
    requestPending = false;
    System.out.println(this.id + " Elevator reached destination: " + destinationFloor);
  }
}

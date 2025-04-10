package elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorMgmtService {
  private static ElevatorMgmtService instance = null;
  private List<Elevator> elevatorList;
  private List<Floor> floorList;
  private ElevatorMgmtService() {
    elevatorList = new ArrayList<>();
    floorList = new ArrayList<>();
  }
  public static synchronized ElevatorMgmtService getInstance() {
    if(instance == null)
      instance = new ElevatorMgmtService();
    return instance;
  }
  public void addElevators(Elevator elevator) {
    elevatorList.add(elevator);
  }
  public void addFloors(Floor floor) {
    floorList.add(floor);
  }
  public void startup() {
    for (Elevator elevator : this.elevatorList) {
      Thread thread = new Thread(elevator);
      thread.start();
    }
  }

  public void request(int start, int end) {
    Elevator elevator = findOptimalElevator(start);
    elevator.acceptRequest(start, end);
  }
  public Elevator findOptimalElevator(int start) {
    int minDistance = Integer.MAX_VALUE;
    Elevator optimalElevator = null;
    for (Elevator elevator : elevatorList) {
      if (!elevator.isMoving()) {
        int distance = Math.abs(elevator.getCurrentFloor() - start);
        if (distance < minDistance) {
          minDistance = distance;
          optimalElevator = elevator;
        }
      }
    }

    if (optimalElevator == null) {
      optimalElevator = elevatorList.getFirst(); // Fallback if all elevators are moving
    }
    return optimalElevator;
  }
}

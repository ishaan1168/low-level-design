package elevator;

public class Main {
  public static void main(String[] args) {
    ElevatorMgmtService elevatorMgmtService = ElevatorMgmtService.getInstance();

    Floor floor0 = new Floor(0);
    Floor floor1 = new Floor(1);
    Floor floor2 = new Floor(2);
    Floor floor3 = new Floor(3);
    Floor floor4 = new Floor(4);
    Floor floor5 = new Floor(5);

    elevatorMgmtService.addFloors(floor0);
    elevatorMgmtService.addFloors(floor1);
    elevatorMgmtService.addFloors(floor2);
    elevatorMgmtService.addFloors(floor3);
    elevatorMgmtService.addFloors(floor4);
    elevatorMgmtService.addFloors(floor5);


    elevatorMgmtService.addElevators(new Elevator(1));
    elevatorMgmtService.addElevators(new Elevator(2));
    elevatorMgmtService.addElevators(new Elevator(3));

    elevatorMgmtService.startup();

    elevatorMgmtService.request(2,4);
    elevatorMgmtService.request(0,5);
    elevatorMgmtService.request(0,4);
  }
}

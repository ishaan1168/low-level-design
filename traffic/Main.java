package traffic;

public class Main {
  public static void main(String[] args) {
    TrafficLightSystem trafficLightSystem = TrafficLightSystem.getInstance();
    Road r1 = new Road("Ishaan Road", 10, 10, 5);
    Road r2 = new Road("Shivam Road", 10, 20, 7);

    trafficLightSystem.addRoad(r1);
    trafficLightSystem.addRoad(r2);

    TrafficSignal trafficSignal1 = new TrafficSignal(r1, 60000, 5000, 30000, false);
    TrafficSignal trafficSignal2 = new TrafficSignal(r2, 45000, 5000, 20000, false);

    trafficLightSystem.addSignal(trafficSignal1);
    trafficLightSystem.addSignal(trafficSignal2);

    trafficLightSystem.startSystem();

    trafficLightSystem.shutdown();
  }
}




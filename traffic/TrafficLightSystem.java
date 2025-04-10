package traffic;

import java.util.ArrayList;
import java.util.List;

public class TrafficLightSystem {
  private static TrafficLightSystem trafficLightSystem = null;
  private List<Road> roads;
  private List<TrafficSignal> trafficSignals;
  private TrafficLightSystem() {
    this.roads = new ArrayList<>();
    this.trafficSignals = new ArrayList<>();
  }
  public static synchronized TrafficLightSystem getInstance() {
    if(trafficLightSystem == null)
      trafficLightSystem = new TrafficLightSystem();
    return trafficLightSystem;
  }

  public void startSystem() {
    for (TrafficSignal trafficSignal : trafficSignals) {
      Thread thread = new Thread(trafficSignal);
      thread.start();
    }
  }

  public void addSignal(TrafficSignal trafficSignal) {
    this.trafficSignals.add(trafficSignal);
  }

  public void addRoad(Road road) {
    this.roads.add(road);
  }

  public void shutdown() {
    for(TrafficSignal trafficSignal: trafficSignals)
      trafficSignal.shutdown();
  }
}

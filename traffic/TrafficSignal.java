package traffic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TrafficSignal implements Runnable{
  Road road;
  int redLightTime;
  int yellowLightTime;
  int greenLightTime;
  boolean running;

  @Override
  public void run() {
    startup();
    while(running) {
      System.out.println(this.road.getRoad() + " The light is red");
      try {
        Thread.sleep(this.redLightTime);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println(this.road.getRoad() + " The light is yellow");
      try {
        Thread.sleep(this.yellowLightTime);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println(this.road.getRoad() + " The light is green");
      try {
        Thread.sleep(this.greenLightTime);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public void shutdown() {
    this.running = false;
  }

  public void startup() {
    this.running = true;
  }

}

package jobscheduler;

public class Job {
  int id;
  String name;
  int priority;

  Job(int id, String name, int priority) {
    this.id = id;
    this.name = name;
    this.priority = priority;
  }

  public int getPriority() {
    return this.priority;
  }

  public void execute() throws InterruptedException {
    Thread.sleep(10000);
    System.out.println("Job Done " + this.name);
  }
}

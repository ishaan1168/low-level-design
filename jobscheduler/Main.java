package jobscheduler;

public class Main {
  public static void main(String[] args) {
    Scheduler instance = Scheduler.getInstance(10);
    Job J1 = new Job(1, "Test", 2);
    Job J2 = new Job(2, "Ptest", 3);
    Job J3 = new Job(3, "Ctest", 4);

    instance.addJob(J1);
    instance.addJob(J2);
    instance.addJob(J3);

    instance.runWorkers(2);

    instance.addJob(J2);
    instance.addJob(J1);
  }
}

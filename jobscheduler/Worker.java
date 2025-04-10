package jobscheduler;

public class Worker implements Runnable{
  Scheduler scheduler;

  Worker(Scheduler scheduler) {
    this.scheduler = scheduler;
  }

  public void run() {
    while (true) {
      Job job = scheduler.getQueue().poll();
      if(job != null) {
        try {
          job.execute();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
      else{
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}

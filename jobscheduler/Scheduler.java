package jobscheduler;

import java.util.PriorityQueue;
import java.util.Queue;

public class Scheduler {
  Queue<Job> queue;
  int size;
  private static Scheduler instance = null;

  private Scheduler(int size) {
    this.size = size;
    this.queue = new PriorityQueue<>(size, (a,b) -> Integer.compare(b.getPriority(), a.getPriority()));
  }

  public static synchronized Scheduler getInstance(int size) {
    if(instance == null){
      instance = new Scheduler(size);
    }
    return instance;
  }

  public void addJob(Job job) {
    queue.add(job);
  }

  public Queue<Job> getQueue() {
    return this.queue;
  }

  public void runWorkers(int num) {
    for(int i=0;i<num;i++) {
      Thread thread = new Thread(new Worker(this));
      thread.start();
    }
  }

}

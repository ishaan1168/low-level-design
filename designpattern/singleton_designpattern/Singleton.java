package designpattern.singleton_designpattern;

public class Singleton {
  public static Singleton instance = null;
  private Singleton(){}
  public static synchronized Singleton getInstance() {
    if(instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
  public void show() {
    System.out.println("Singleton instance");
  }
}
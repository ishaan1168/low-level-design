package snakesandladders;

public abstract class Element {
  int start;
  int end;

  public Element(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public int getStart() {
    return this.start;
  }

  public int getEnd() {
    return this.end;
  }
}

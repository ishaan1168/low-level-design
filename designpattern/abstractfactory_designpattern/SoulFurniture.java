package designpattern.abstractfactory_designpattern;

public class SoulFurniture implements Furniture{

  @Override
  public Chair makeChair() {
    return new SoulChair();
  }

  @Override
  public Table makeTable() {
    return new SoulTable();
  }
}

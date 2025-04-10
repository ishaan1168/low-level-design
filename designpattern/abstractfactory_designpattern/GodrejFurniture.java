package designpattern.abstractfactory_designpattern;

public class GodrejFurniture implements Furniture{
  @Override
  public Chair makeChair() {
    return new GodrejChair();
  }

  @Override
  public Table makeTable() {
    return new GodrejTable();
  }
}

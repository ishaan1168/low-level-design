package designpattern.abstractfactory_designpattern;

public class FurnitureFactory {
  public Furniture generateFurniture(FurnitureType furnitureType) {
    if(furnitureType.equals(FurnitureType.SOUL))
      return new SoulFurniture();
    else if(furnitureType.equals(FurnitureType.GODREJ))
      return new GodrejFurniture();
    else
      throw new IllegalArgumentException("Not a valid Furniture company");
  }
}

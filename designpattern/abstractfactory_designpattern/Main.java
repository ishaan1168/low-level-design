package designpattern.abstractfactory_designpattern;

public class Main {
  public static void main(String[] args) {
    FurnitureFactory furnitureFactory = new FurnitureFactory();
    Furniture furniture = furnitureFactory.generateFurniture(FurnitureType.SOUL);
    Chair chair = furniture.makeChair();
    Table table = furniture.makeTable();
    chair.display();
    table.display();
  }
}

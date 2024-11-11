import java.util.ArrayList;

public class Runner {
  public static void printMap(Unit[][] map) {
    System.out.println("Map:");
    for (Unit[] row : map) {
      for (Unit u : row) {
        if (u == null) {
          System.out.print(".");
        } else {
          System.out.print(u.getName());
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ArrayList<Unit> unitL = new ArrayList<Unit>();
    Unit[][] unitMap = new Unit[10][10];

    Rock r = new Rock("R", 2, 4);
    unitL.add(r);
    unitMap[4][2] = r;
    printMap(unitMap);

    Plane p = new Plane("P", 1, 1);
    unitL.add(p);
    unitMap[1][1] = p;
    printMap(unitMap);
    
    if (unitL.get(0).canMove(unitL, 5, 0)) {
      unitL.get(0).setPosition(5, 0);
      unitMap[0][5] = unitL.get(0);
      unitMap[4][2] = null;
    } else {
      System.out.println("You cannot move there.");
    }
    printMap(unitMap);

    if (unitL.get(1).canMove(unitL, 5, 0)) {
      unitL.get(1).setPosition(5, 0);
      unitMap[0][5] = unitL.get(1);
      unitMap[1][1] = null;
    } else {
      System.out.println("You cannot move there.");
    }
    printMap(unitMap);
  }
}

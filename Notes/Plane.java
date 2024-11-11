import java.util.ArrayList;

public class Plane extends Unit {
  // this class is a child of Unit.
  public Plane(String n, int x, int y) {
    super(n, x, y);
  }

  // planes cannot move over rocks.
  public boolean canMove(ArrayList<Unit> board, int x, int y) {
    for (Unit u : board) {
      if (u.getX() == x && u.getY() == y) {
        if (u.getType().equals("Rock")) {
          return false;
        }
      }
    }
    return true;
  }
  public String getType() {
    return "Plane";
  }
}

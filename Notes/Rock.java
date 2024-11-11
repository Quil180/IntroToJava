import java.util.ArrayList;

public class Rock extends Unit {
  public Rock(String n, int x, int y) {
    super(n, x, y);
  }
  public boolean canMove(ArrayList<Unit> board, int x, int y) {
    return false;
  }
  public String getType() {
    return "Rock";
  }
}

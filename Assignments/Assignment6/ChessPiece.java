/*
 * Yousef Awad
 * Assignment 6: Inheritance
 * COP 3330
 * November 3rd, 2024
 */
import java.util.ArrayList;

public abstract class ChessPiece {
  /**
   * masterList stores all the chess pieces in the game.
   * color stores the color of the chess piece.
   */
  public static ArrayList<ChessPiece> masterList = new ArrayList<ChessPiece>();
  private String color;

  public ChessPiece(String color) {
    this.color = color;
    masterList.add(this);
  }

  public String getColor() {
    return this.color;
  }

  /**
   * @param row - The row of the space we are checking
   * @param col - The column of the space we are checking
   * @return return the chess piece that is currently in this space.
   *         If there is none return null.
   */
  public static ChessPiece isOccupied(int row, int col) {
    if (!masterList.isEmpty()) {
      // if the list isn't empty
      for (int i = 0; i < masterList.size(); i++) {
        // go through each index of the masterList.
        if (masterList.get(i).getRow() == row && masterList.get(i).getCol() == col) {
          // and check if they are in the same spot as the one you want to find.
          // If so, return that piece!
          return masterList.get(i);
        }
      }
    }
    // if the list was empty, return null.
    return null;
  }

  public abstract int getRow();

  public abstract int getCol();

  public abstract boolean isValidMove(int row, int col);
}

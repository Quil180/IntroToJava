/*
 * Yousef Awad
 * Assignment 6: Inheritance
 * COP 3330
 * November 3rd, 2024
 */

public class Knight extends ChessPiece {
  private int row, column;

  public Knight(String colour, int r, int c) {
    super(colour);
    this.row = r;
    this.column = c;
  }

  @Override
  public boolean isValidMove(int row, int col) {
    // Knights move in an "L" shape: two squares in one direction and one in the
    // perpendicular direction.

    // finding the movements wanted left and right.
    int rowDiff = Math.abs(this.getRow() - row);
    int colDiff = Math.abs(this.getCol() - col);

    // Check if the move is a valid "L" shape move for a Knight.
    if (!((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2))) { // one of the differences must be 2 and
                                                                               // the other 1.
      return false; // Not a valid Knight move.
    }

    // Check if the destination is occupied by a friendly piece.
    if (ChessPiece.isOccupied(row, col) != null &&
        ChessPiece.isOccupied(row, col).getColor() == this.getColor()) {
      return false;
    }

    return true; // Move is valid.
  }

  public int getRow() {
    return this.row;
  }

  public int getCol() {
    return this.column;
  }
}

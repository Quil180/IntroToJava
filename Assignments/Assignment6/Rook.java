/*
 * Yousef Awad
 * Assignment 6: Inheritance
 * COP 3330
 * November 3rd, 2024
 */

public class Rook extends ChessPiece {
  private int column, row;

  public Rook(String colour, int r, int c) {
    super(colour);
    this.row = r;
    this.column = c;
  }

  @Override
  public boolean isValidMove(int row, int col) {
    // Check if the destination is within the same row or column.
    if ((this.getRow() != row && this.getCol() != col) || row >= 8 || col >= 8 || row < 0 || col < 0) {
      return false;
    }

    // Check if there is any piece in the way (moving vertically or horizontally).
    if (this.getRow() == row) {
      // Moving horizontally.
      int start = Math.min(this.getCol(), col) + 1;
      int end = Math.max(this.getCol(), col);

      for (int walker = start; walker < end; walker++) {
        if (ChessPiece.isOccupied(row, walker) != null) {
          return false; // Path is blocked.
        }
      }
    } else if (this.getCol() == col) {
      // Moving vertically.
      int start = Math.min(this.getRow(), row) + 1;
      int end = Math.max(this.getRow(), row);

      for (int walker = start; walker < end; walker++) {
        if (ChessPiece.isOccupied(walker, col) != null) {
          return false; // Path is blocked.
        }
      }
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

public class ChessTester {
  public static void main(String[] args) {
    System.out.println("Rook Test");
    new Rook("Black", 6, 4);
    new Knight("White", 4, 2);
    new Knight("Black", 6, 2);
    new Rook("Black", 2, 4);

    // System.out.println(ChessPiece.masterList.size());
    System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 6));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 5));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 3));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 2));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 1));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 1));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(1, 4));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(2, 4));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(3, 4));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(4, 4));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(8, 4));
    System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 4));

    System.out.println();
    while (!ChessPiece.masterList.isEmpty()) {
      ChessPiece.masterList.remove(0);
    }

    System.out.println("Knight Test");
    new Rook("Black", 6, 4);
    new Knight("White", 4, 2);
    new Knight("Black", 6, 3);
    new Rook("White", 2, 3);

    // System.out.println(ChessPiece.masterList.size());
    System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 3));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 1));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(2, 3));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(2, 1));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(5, 4));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 4));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(5, 0));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 0));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 3));
    System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 4));
  }
}

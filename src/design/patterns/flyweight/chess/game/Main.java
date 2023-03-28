package design.patterns.flyweight.chess.game;


// we use that pattern to save the space in our memory
// enum approach I think is better than two classes with UnitStat and UnitStatRepository
public class Main {
    public static void main(String[] args) {
        ChessPiece blackKing = new ChessPiece(Figure.KING,"7", "a", Color.BLACK);
        ChessPiece whiteKing = new ChessPiece(Figure.KING,"7", "a", Color.WHITE);
        ChessPiece blackQueen = new ChessPiece(Figure.QUEEN,"7", "a", Color.BLACK);
        ChessPiece whiteQueen = new ChessPiece(Figure.QUEEN,"7", "a", Color.WHITE);
        //exactly same color object is used
        System.out.println(blackKing.getColor()==blackQueen.getColor());
        System.out.println(whiteKing.getColor()==whiteQueen.getColor());
    }
}

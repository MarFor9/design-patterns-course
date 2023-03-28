package design.patterns.flyweight.chess.game;

public class ChessPiece {
    private final Figure figure;
    private String numberPosition;
    private String letterPosition;
    private final Color color;

    public ChessPiece(Figure figure, String numberPosition, String letterPosition, Color color) {
        this.figure = figure;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        this.color = color;
    }

    public Figure getFigure() {
        return figure;
    }

    public String getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}

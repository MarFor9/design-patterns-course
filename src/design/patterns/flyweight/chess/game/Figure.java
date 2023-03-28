package design.patterns.flyweight.chess.game;

public enum Figure {
    QUEEN("Krolowa"),
    KING("Krol");

    private String name;

    Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package design.patterns.proxy;

public class SaveGameProxy implements SavedGame {

    private String name;
    private SavedGame savedGame;

    @Override
    public void initialize() {
        name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        savedGame = new SavedGameFull();
        savedGame.initialize();
        savedGame.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}

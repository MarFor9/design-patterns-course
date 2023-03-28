package design.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        GuessGame game = GuessGame.INSTANCE;

        System.out.println("Start a game");
        game.play();

        System.out.println("display score");
        System.out.println(game.getScore());

    }
}

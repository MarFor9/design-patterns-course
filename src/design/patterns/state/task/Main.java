package design.patterns.state.task;

public class Main {
    public static void main(String[] args) {
        GameMachine gameMachine = new GameMachine();

        gameMachine.insertMoney();
        gameMachine.pullTheLever();
        gameMachine.takeTheMoney();
        gameMachine.actuallyState();

    }
}

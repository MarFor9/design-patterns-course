package design.patterns.state.task;

public class LackMoney implements State {
    @Override
    public void insertMoney(GameMachine gameMachine) {
        System.out.println("Wrzucono monete");
        gameMachine.state = new InsertedCoin();
    }

    @Override
    public void pullTheLever(GameMachine gameMachine) {
        System.out.println("Wrzuc monete");
    }

    @Override
    public void takeTheMoney(GameMachine gameMachine) {
        System.out.println("Wrzuc monete");
    }

    @Override
    public void currentState(GameMachine gameMachine) {
        System.out.println("Czekam na monete");
    }
}

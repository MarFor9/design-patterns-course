package design.patterns.state.task;

public interface State {
    void insertMoney(GameMachine gameMachine);
    void pullTheLever(GameMachine gameMachine);
    void takeTheMoney(GameMachine gameMachine);
    void currentState(GameMachine gameMachine);
}

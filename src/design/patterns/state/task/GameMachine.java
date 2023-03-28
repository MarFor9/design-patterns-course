package design.patterns.state.task;

public class GameMachine {
    protected State state;

    public GameMachine() {
        this.state = new LackMoney();
    }

    public void insertMoney(){
        state.insertMoney(this);
    }

    public void pullTheLever(){
        state.pullTheLever(this);
    }
    public void takeTheMoney(){
        state.takeTheMoney(this);
    }
    public void actuallyState(){
        state.currentState(this);
    }

}

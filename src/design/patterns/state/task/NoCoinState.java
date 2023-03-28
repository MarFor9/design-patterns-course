package design.patterns.state.task;

public class NoCoinState implements State {

    public void insertMoney(GameMachine context) {
        System.out.println("Wrzucono monetę.");
        context.state = new InsertedCoin();
    }

    public void pullTheLever(GameMachine context) {
        System.out.println("Wrzuć monetę by zagrać.");
    }

    public void takeTheMoney(GameMachine context) {
        System.out.println("Wrzuć monetę by dać sobie szansę na wygraną.");
    }

    public void currentState(GameMachine context) {
        System.out.println("Aktualny stan - BRAK MONETY");
    }
}

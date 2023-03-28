package design.patterns.state.task;

public class WinState implements State {

    public void insertMoney(GameMachine context) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    public void pullTheLever(GameMachine context) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    public void takeTheMoney(GameMachine context) {
        System.out.println("Zabrano monety. Gratulacje.");
        context.state = new NoCoinState();
    }

    public void currentState(GameMachine context) {
        System.out.println("Aktualny stan - WYGRANA");
    }
}

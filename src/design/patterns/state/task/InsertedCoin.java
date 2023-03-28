package design.patterns.state.task;

import java.util.Random;

public class InsertedCoin implements State{

    static final private Random random = new Random();
    @Override
    public void insertMoney(GameMachine gameMachine) {
        System.out.println("Moneta zostala juz wrzucona");
    }

    @Override
    public void pullTheLever(GameMachine gameMachine) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if(result<20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            gameMachine.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            gameMachine.state = new NoCoinState();
        }
    }

    @Override
    public void takeTheMoney(GameMachine gameMachine) {
        System.out.println("Pociagnij dzwignie");
    }

    @Override
    public void currentState(GameMachine gameMachine) {
        System.out.println("Czekam na pociagniecie dzwigni");
    }
}

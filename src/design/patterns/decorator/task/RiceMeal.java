package design.patterns.decorator.task;

public class RiceMeal extends Meal {
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje danie na bazie ryzu.");
    }
}

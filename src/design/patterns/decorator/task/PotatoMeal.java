package design.patterns.decorator.task;

public class PotatoMeal extends Meal {
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje danie na bazie ziemniakow.");
    }
}

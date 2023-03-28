package design.patterns.decorator.task;

public class SauceMealDecorator extends MealDecorator{
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    private void addSauce() {
        System.out.println("Danie polewam sosem.");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
}

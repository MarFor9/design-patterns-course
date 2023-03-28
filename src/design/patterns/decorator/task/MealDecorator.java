package design.patterns.decorator.task;

public abstract class MealDecorator extends Meal {
    protected Meal meal;

    MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}

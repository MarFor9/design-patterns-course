package design.patterns.decorator.task;

public class ShrimpMealDecorator extends MealDecorator{
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    private void addShrimp() {
        System.out.println("Do dania dodaje krewetki.");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }
}

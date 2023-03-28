package design.patterns.template.method.task;

public abstract class UsuallyDayAtWork {
    public final void startDaySequence(TypeOfTransport typeOfTransport) {
        wakeUp();
        brushTheTeeth();
        eatBreakfast();
        drinkCoffee();
        goToWork(typeOfTransport);
    }

    private void wakeUp() {
        System.out.println("I wake up always");
    }

    private void brushTheTeeth() {
        System.out.println("I brush the teeth always");
    }

    public abstract void eatBreakfast();

    public abstract void drinkCoffee();

    public abstract void goToWork(TypeOfTransport typeOfTransport);
}

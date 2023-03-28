package design.patterns.template.method.task;

public class Manager extends UsuallyDayAtWork {
    @Override
    public void eatBreakfast() {
        System.out.println("I eat usually scrambled eggs");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("I usually drink coffee conleche");
    }

    @Override
    public void goToWork(TypeOfTransport typeOfTransport) {
        System.out.print("I usually got to work by: ");
        switch (typeOfTransport) {
            case CAR:
                System.out.println("by Car.");
                break;
            case BUSS:
                System.out.println("by Buss.");
                break;
            case WALK:
                System.out.println("on my own food.");
                break;
            default:
                throw new UnsupportedOperationException("I don't know! :D");
        }
    }
}

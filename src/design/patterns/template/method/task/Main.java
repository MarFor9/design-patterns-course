package design.patterns.template.method.task;

public class Main {
    public static void main(String[] args) {
        UsuallyDayAtWork dayAtWork = new Manager();
        dayAtWork.startDaySequence(TypeOfTransport.WALK);
    }
}

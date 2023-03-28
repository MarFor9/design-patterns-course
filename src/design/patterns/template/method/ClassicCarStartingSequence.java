package design.patterns.template.method;

public class ClassicCarStartingSequence extends CarStartingSequence{

    public void startTheGear() {
        System.out.println("Wybieramy bieg");
    }

    public void startTheIgnition() {
        System.out.println("Przekrecamy kluczyk");
    }
}

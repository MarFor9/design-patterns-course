package design.patterns.template.method;

public abstract class CarStartingSequence {
    public final void startTheCar() {
        fastenSeatBelts();
        startTheIgnition();
        startTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedal gazu");
    }

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }

    public abstract void startTheIgnition();

    public abstract void startTheGear();
}

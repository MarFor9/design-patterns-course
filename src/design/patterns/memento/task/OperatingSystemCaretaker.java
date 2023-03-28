package design.patterns.memento.task;

public class OperatingSystemCaretaker {
    private OperatingSystemMemento operatingSystemMemento;

    public OperatingSystemMemento getOperatingSystemMemento() {
        return operatingSystemMemento;
    }

    public void setOperatingSystemMemento(OperatingSystemMemento operatingSystemMemento) {
        this.operatingSystemMemento = operatingSystemMemento;
    }
}

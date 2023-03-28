package design.patterns.memento.smart_app;


public class SmartApp {
    private Double version;

    public void changeVersion(Double version) {
        this.version = version;
        System.out.println("Nowa wersja: " + version);
    }

    public SmartAppMemento save() {
        return new SmartAppMemento(version);
    }

    public void load(SmartAppMemento memento) {
        this.version = memento.getVersion();
    }
}
